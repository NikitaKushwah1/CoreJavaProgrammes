package ageexceptionusingthrowandthorows;

public class SimpleExample {
    public static void main(String[] args)  {
        Student student = new Student("Ahmed");
        
        try {
            student.setAge(25);     
            student.setAge(150);   
            } catch (AgeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
