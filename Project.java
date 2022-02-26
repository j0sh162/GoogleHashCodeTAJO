import java.util.ArrayList;

class Project{
    private String name;
    private int duration;
    private int score;
    private int bestBefore;
    private ArrayList<String> roles;
    private double rating = 0.0;
    private boolean done = false;
    private boolean workedon = false;

    private ArrayList<Person> personsOnProject;

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
    public double getRating() {
        return rating;
    }
    public void setDone(boolean done) {
        this.done = done;
    }
    public void setRating(double rating) {
        this.rating = rating;
    }
    public boolean getDone(){
        return done;
    }
    public ArrayList<Person> getPersonsOnProject(){
        return personsOnProject;
    } 
    public String getName() {
        return name;
    }
    public boolean isWorkedon() {
        return workedon;
    }
    public void setWorkedon(boolean workedon) {
        this.workedon = workedon;
    }
    public void setDuration(int duration) {
        this.duration = duration;
    }
}