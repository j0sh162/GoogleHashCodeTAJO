public class Person {
    private String name;
    private String[] skill;
    private boolean used = false;
    public Person(String n, String[] s){
        name = n;
        skill = s;
        
    }
    public String[] getSkill(){
        return skill;
    }
    public void setUsed(boolean u){
        used = u;
    }
    public boolean getUsed(){
        return used;
    }
}
