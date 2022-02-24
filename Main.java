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

    public static void main(String[] args) {
        ParsingData.readFile();
        System.out.println(hm.toString());
        /*
        // after intiale parsing
        while (true) {
            rate();
            currentDay++;
        }
        */
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
            for (int j = 0; j < ps.get(i).getRoles().size(); j++) {
                Person p;
                hm.get(ps.get(i).getRoles().get(j));
                for (int k = 0; k < hm.get(ps.get(i).getRoles().get(j)).size(); k++) {
                    if(!hm.get(ps.get(i).getRoles().get(j)).get(k).getUsed()){
                        p = hm.get(ps.get(i).getRoles().get(j)).get(k);
                        ps.get(i).getPersonsOnProject().add(p);
                        break;
                    }

                }

            }

        }
    }

}