import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Output {
    public static void outputdata(ArrayList<Project> data, String Filname) throws FileNotFoundException{
        PrintWriter out = new PrintWriter(Filname); 
        String namesOut = "";
        out.println(data.size());
        for(int i =0; i<data.size(); i++){
            out.println(data.get(i).getName());
            for(int j = 0; j<data.get(i).getPersonsOnProject().size(); j++){
                namesOut += data.get(i).getPersonsOnProject().get(j).getName() + " ";
            }
            out.println(namesOut);
        }

        out.close(); 
    }
}
