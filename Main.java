import java.util.ArrayList;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static HashMap<String, LinkedList<Person>> hm = new HashMap<String, LinkedList<Person>>();
    public static ArrayList<Project> ps;
    public static int currentDay = 0;
    public static int finalDay;//Update when andra done

    public static void main(String[] args) {

        System.out.println(hm.toString());
        // after intiale parsing
        
        for (int i = 0; i < finalDay; i++) {
            update();
            rate();
            currentDay++;
        }
        //Call output method
    }

    public static void rate() {
        for (int i = 0; i < ps.size(); i++) {
            if (!ps.get(i).getDone()) {
                int remaingscore = 0;
                if (ps.get(i).getBestBefore() - ps.get(i).getDuration() > 0) {
                    remaingscore = ps.get(i).getScore();
                } else {
                    remaingscore = ps.get(i).getScore() + (ps.get(i).getBestBefore() - ps.get(i).getDuration());
                }
                double temp = remaingscore / (ps.get(i).getDuration() + ps.get(i).getRoles().size());
                ps.get(i).setRating(temp);
            }
        }
    }

    public static void assigmt() {
        for (int i = 0; i < ps.size(); i++) {
            if(ps.get(i).getDone()){
                continue;
            }
            for (int j = 0; j < ps.get(i).getRoles().size(); j++) {
                Person p;
                hm.get(ps.get(i).getRoles().get(j));
                for (int k = 0; k < hm.get(ps.get(i).getRoles().get(j)).size(); k++) {
                    if(!hm.get(ps.get(i).getRoles().get(j)).get(k).getUsed()){
                        p = hm.get(ps.get(i).getRoles().get(j)).get(k);
                        hm.get(ps.get(i).getRoles().get(j)).get(k).setUsed(true);
                        ps.get(i).getPersonsOnProject().add(p);
                        ps.get(i).setWorkedon(true);
                        break;
                    }
                }
            }
        }
    }
    public static void update(){
        for (int i = 0; i < ps.size(); i++) {
            if (ps.get(i).isWorkedon()) {
                ps.get(i).setDuration(ps.get(i).getDuration()-1);
            }
            if (ps.get(i).getDuration()==0) {
                for (int j = 0; j < ps.get(i).getPersonsOnProject().size(); j++) {
                    ps.get(i).getPersonsOnProject().get(j).setUsed(false);
                }
                ps.get(i).setDone(true);
                ps.get(i).setWorkedon(false);
            }
        }
    }
}