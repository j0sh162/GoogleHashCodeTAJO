import java.util.ArrayList;

public class Qucksort {//actaully bubble sort 
    public static ArrayList<Project> sort(ArrayList<Project> list){
        for(int j = 0; j<list.size();j++ ){
            for(int i = 0; i<list.size();i++){
                if((i+1)!=list.size()&&list.get(i).getScore()<list.get(i+1).getScore()){
                    list = swap(list, i, i+1);
                }
            }
        }
        return list;
    }

    public static ArrayList<Project> swap(ArrayList<Project> list, int index1, int index2){
        Project temp = list.get(index1);
        list.set(index1, list.get(index2));
        list.set(index2, temp);
        return list;
        }
/*
    public static void main(String[] args) {
        ArrayList<Project> unosrted = new ArrayList<Project>();
        Project p1 = new Project("webdev", 5, 10, 6, 2);
        unosrted.add(p1);
        Project p2 = new Project("webdev1", 5, 12, 6, 2);
        unosrted.add(p2);
        Project p3 = new Project("webdev2", 5, 50, 6, 2);
        unosrted.add(p3);
        Project p4 = new Project("webdev2", 5, 35, 6, 2);
        unosrted.add(p4);
        Project p5 = new Project("webdev2", 5, 56, 6, 2);
        unosrted.add(p5);
        Project p6 = new Project("webdev2", 5, 14, 6, 2);
        unosrted.add(p6);
        unosrted.add(p2);
        unosrted.add(p2);

        ArrayList<Project> sorted = sort(unosrted);
        for(int y=0; y<sorted.size(); y++){
            System.out.println(sorted.get(y).getScore());
        }
    }*/

}
