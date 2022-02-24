import java.util.ArrayList;

public class Qucksort {//actaully bubble sort 
    public static ArrayList<Project> sort(ArrayList<Project> list){
        for(int j = 0; j<list.size();j++ ){
            for(int i = 0; i<list.size();i++){
                if(list.get(i).getScore()<list.get(i+1).getScore()){
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
}
