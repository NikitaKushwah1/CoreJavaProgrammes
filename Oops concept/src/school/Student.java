package school;

public class Student {
    private String name;
    private int rollNumber;
//    private Subject subject;
     private String subjectName;
     private String subjectCode;

    public Student(String name, int rollNumber, String subjectName,String subjectCode) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.subjectName= subjectName;
        this.subjectCode = subjectCode;
    }

    public void displayStudentInfo() {
        System.out.println("StudentMain Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.print("Enrolled in: ");
        System.out.println("Subject: " + subjectName + " subjectCode: " + subjectCode );
//        subject.displaySubjectInfo();
    }
}
