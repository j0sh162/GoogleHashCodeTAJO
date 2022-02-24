import java.util.ArrayList;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Scanner;

public class Main{
    public static HashMap<String, LinkedList<Person>> hm = new HashMap<String,LinkedList<Person>>();
    public static ArrayList<Project> ps;
    public static void main(String[] args) {
        Scanner s = new Scanner("b_better_start_small.in");
        
        String [] test = {"r","s"};
        Person p = new Person("a",test);
        System.out.println(p);
        Person p2 = new Person("ab",test);
        System.out.println(p2);
       
        hm.put("test", new LinkedList<Person>());
        hm.get("test").add(p);
        hm.get("test").add(p2);

        System.out.println(hm.toString());
        

    }
    public void update(int i){
        
    }


}