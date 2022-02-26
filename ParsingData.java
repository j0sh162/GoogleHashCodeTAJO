import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
@SuppressWarnings("unused")
public class ParsingData {
    public static void readFile() {
        try {








            File inputFile = new File("a_an_example.in.txt");
            Scanner scanFile = new Scanner(inputFile);
            String text ="";
            boolean first = true;

            int noP = 0;
            int noProj = 0;

            String name = "";
            while(scanFile.hasNextLine()){
                if(first){
                    String[] temp = scanFile.nextLine().split(" ");
                    noP = Integer.parseInt(temp[0]);
                    noProj = Integer.parseInt(temp[1]);
                    first = false;
                    continue;

                }
                for(int j = 0;j<noP;j++) {
                    name = scanFile.nextLine();
                    String[] temp = name.split(" ");
                    int lines = Integer.parseInt(temp[1]);
                    String[] skills = new String[lines];
                    for (int i = 0; i < lines; i++) {
                        String s = scanFile.nextLine();
                        skills[i] = s;
                        if (!Main.hm.containsKey(s)) {
                            Main.hm.put(s, new LinkedList<Person>());
                        }
                    }

                    Person p = new Person(name, skills);
                    for (String skill : skills) {
                        Main.hm.get(skill).add(p);
                    }
                }
                for (int i = 0; i < noProj; i++) {
                    String[] proj = scanFile.nextLine().split(" ");

                    int lines = Integer.parseInt(proj[proj.length-1]);
                    ArrayList<String> skills = new ArrayList<>();

                    for (int j = 0; j < lines; j++) {
                        String s = scanFile.nextLine();
                        skills.add(s);
                    }
                    Main.ps.add(new Project(proj[0],Integer.parseInt(proj[1]),Integer.parseInt(proj[2]),Integer.parseInt(proj[3]),skills));

                }
            }

          
            // boolean t = true;
            // while (noP > 0) {
                
            //     String name = scanFile.nextLine();

            //     int noSkillz = 0;
            //     String[] skillz ={};
            //     if(t){
            //         String[]temp = name.split(" ");
            //         noSkillz = Integer.parseInt(temp[1]);
            //         skillz = new String[noSkillz];
            //     }

            //     for (int i = 0; i < noSkillz; i++) {
            //         String s = scanFile.nextLine();
            //         skillz[i] = s;
            //         if (!Main.hm.containsKey(s)) {
            //             Main.hm.put(s, new LinkedList<Person>());
            //         }
            //     }

            //     Person p = new Person(name, skillz);

            //     for (String skills : skillz) {
            //         Main.hm.get(skills).add(p);
            //     }

            //     noP--;
            // }

            // while (noProj > 0) {
            //     String name = scanFile.next();
            //     System.out.println(name);
            //     int days = scanFile.nextInt();
            //     System.out.println(days);
            //     int score = scanFile.nextInt();
            //     System.out.println(score);
            //     int bestBefore = scanFile.nextInt();
            //     int noRoles = scanFile.nextInt();

            //     Project proj = new Project(name, days, score, bestBefore, noRoles);

            //     for (int i = 0; i < noRoles; i++) {
            //         proj.addRole(scanFile.nextLine());
            //     }

            //     Main.ps.add(proj);

            //     noProj--;
            // }

            // scanFile.close();



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
