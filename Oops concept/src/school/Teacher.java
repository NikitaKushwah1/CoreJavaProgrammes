package school;
 
public class Teacher {
    private String name;
    private int teacherId;
//    private Subject subject;
    private String subjectName;
    private String subjectCode;
    
    
    public Teacher(String name, int teacherId, String subjectName,String subjectCode) {
        this.name = name;
        this.teacherId = teacherId;
        this.subjectName = subjectName;
        this.subjectCode = subjectCode;
    }

    public void  displayTeacherInfo() {
        System.out.println("Teacher Name: " + name);
        System.out.println("Teacher ID: " + teacherId);
        System.out.print("Teaches: ");
        System.out.println("Subject: " + subjectName + " SubjectCode: " + subjectCode );
//        subject.displaySubjectInfo();
    }
}
