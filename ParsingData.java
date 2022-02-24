import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;

public class ParsingData {
    public static void readFile() {
        try {
            File inputFile = new File("A.txt");
            Scanner scanFile = new Scanner(inputFile);

            int noP = scanFile.nextInt();
            int noProj = scanFile.nextInt();

            while(noP > 0) {
                String name = scanFile.next();
                int noSkillz = scanFile.nextInt();
                String[] skillz = new String[noSkillz];

                for(int i = 0; i < noSkillz; i++) {
                    String s = scanFile.nextLine();
                    skillz[i] = s;
                    if(!Main.hm.containsKey(s)){
                        Main.hm.put(s,new LinkedList<Person>());
                    }
                }
                Person p = new Person(name,skillz);
                for (String skills : skillz) {
                    Main.hm.get(skills).add(p);
                }
            }

            while(noProj > 0) {
                String name = scanFile.next();
                int days = scanFile.nextInt();
                int score = scanFile.nextInt();
                int bestBefore = scanFile.nextInt();
                int noRoles = scanFile.nextInt();

                Project proj = new Project(name, days, score, bestBefore, noRoles);

                for(int i = 0; i < noRoles; i++) {
                    proj.addRole(scanFile.nextLine());
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
