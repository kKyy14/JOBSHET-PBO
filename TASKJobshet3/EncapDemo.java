package TASKJobshet3;

public class EncapDemo {
    private String name;
    private int age;

    public String getName() {
        return name;
    }
    public void setName (String newname) {
        this.name = newname;
    }
    public int getAge() {
        return age;
    }
    public void setAge (int newage) {
        if (newage > 30) {
            age = 30;
        }
        else if(newage < 18)
        {
        age = 18;
        }
        else    
        {
            age = newage;
        }
    }
    
}
