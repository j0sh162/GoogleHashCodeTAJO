import java.util.ArrayList;

class Project{
    private String name;
    private int duration;
    private int score;
    private int bestBefore;
    private ArrayList<String> roles;

    public Project(String nameIn, int durationIn, int scoreIn, int bestBeforeIn, int amountRoles){
        roles = new ArrayList<>(amountRoles);
        name = nameIn;
        duration = durationIn;
        score = scoreIn;
        bestBefore = bestBeforeIn;
    }

    public void addRole(String roleIn){
        roles.add(roleIn);
    }

    public int getBestBefore() {
        return bestBefore;
    }

    public int getDuration() {
        return duration;
    }

    public int getScore() {
        return score;
    }

    public ArrayList<String> getRoles() {
        return roles;
    }

    public void update(int i){
        if(i<bestBefore){
            score = (i-bestBefore);
        }
    }

}