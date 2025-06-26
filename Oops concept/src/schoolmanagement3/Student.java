package schoolmanagement3;

public class Student {
    private int roll;
    private String name;
    private String[] subjects;

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSubjects(String[] subjects) {
        this.subjects = subjects;
    }

    public int getRoll() {
        return roll;
    }

    public String getName() {
        return name;
    }

    public String[] getSubjects() {
        return subjects;
    }

    public String displayStudent() {
        return "Roll No: " + roll + " | Name: " + name;
    }
}
 
