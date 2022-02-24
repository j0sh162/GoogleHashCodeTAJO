import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Output {
    public static void outputdata(ArrayList<Project> data) throws FileNotFoundException{
        PrintWriter out = new PrintWriter("test.txt"); 
        out.println(data.size());
        for(int i =0; i<data.size(); i++){
            out.println(data.get(i).getName());
            out.print(data.get(i).getRoles());
        }

        out.close(); 
    }
    public static String names(ArrayList<Strings> names){
        
    }
}
