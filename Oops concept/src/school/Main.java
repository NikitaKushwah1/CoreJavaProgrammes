package school;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	 Scanner sc = new Scanner(System.in);
    	 System.out.println(" === Welcome to school === ");

//          Subject info
         System.out.print("Enter Subject Name: ");
         String subjectName = sc.nextLine();
         System.out.print("Enter Subject Code: ");
         String subjectCode = sc.nextLine();
         Subject subject = new Subject(subjectName, subjectCode);

//          Teacher info
         System.out.print("\nEnter Teacher Name: ");
         String teacherName = sc.nextLine();
         System.out.print("Enter Teacher ID: ");
         int teacherId = sc.nextInt();
         sc.nextLine(); 
//         System.out.print("Enter subject: ");
//         String sub = sc.nextLine();
         Teacher teacher = new Teacher(teacherName, teacherId, subjectName,subjectCode);

//           StudentMain info
         System.out.print("\nEnter StudentMain Name: ");
         String studentName = sc.nextLine();
         System.out.print("Enter StudentMain Roll Number: ");
         int rollNumber = sc.nextInt();
         Student student = new Student(studentName, rollNumber, subjectName,subjectCode);
         
         System.out.println("=== Teacher Info ===");
        teacher.displayTeacherInfo();

        System.out.println("\n=== StudentMain Info ===");
        student.displayStudentInfo();
    }
}
