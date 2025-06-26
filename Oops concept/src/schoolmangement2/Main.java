 package schoolmangement2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student[] students = new Student[100];
        Teacher[] teachers = new Teacher[50];
        Subject[] subjects = new Subject[50];
        int studentCount = 0, teacherCount = 0, subjectCount = 0;

        while (true) {
            System.out.println("\n--- School Management System ---");
            System.out.println("1. Add Subject");
            System.out.println("2. Add Teacher");
            System.out.println("3. Add StudentMain");
            System.out.println("4. Show All Subjects");
            System.out.println("5. Show All Teachers");
            System.out.println("6. Show All Students");
            System.out.println("7. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter subject name: ");
                    String subName = sc.nextLine();
                    subjects[subjectCount++] = new Subject(subName);
                    System.out.println("Subject added.");
                    break;

                case 2:
                    System.out.print("Enter teacher name: ");
                    String tName = sc.nextLine();
                    System.out.print("How many subjects this teacher teaches? ");
                    int subCount = sc.nextInt();
                    sc.nextLine();

                    String[] tSubjects = new String[subCount];
                    for (int i = 0; i < subCount; i++) {
                        System.out.print("Enter subject " + (i + 1) + ": ");
                        tSubjects[i] = sc.nextLine();
                    }

                    teachers[teacherCount++] = new Teacher(tName, tSubjects);
                    System.out.println("Teacher added.");
                    break;

                case 3:
                    System.out.print("Enter student name: ");
                    String sName = sc.nextLine();
                    System.out.print("Enter roll number: ");
                    int roll = sc.nextInt();
                    sc.nextLine();
                    System.out.print("How many subjects this student studies? ");
                    int sSubCount = sc.nextInt();
                    sc.nextLine();

                    String[] sSubjects = new String[sSubCount];
                    for (int i = 0; i < sSubCount; i++) {
                        System.out.print("Enter subject " + (i + 1) + ": ");
                        sSubjects[i] = sc.nextLine();
                    }

                    students[studentCount++] = new Student(sName, roll, sSubjects);
                    System.out.println("StudentMain added.");
                    break;

                case 4:
                    System.out.println("\n--- All Subjects ---");
                    for (int i = 0; i < subjectCount; i++) {
                        System.out.println("- " + subjects[i].getName());
                    }
                    break;

                case 5:
                    System.out.println("\n--- All Teachers ---");
                    for (int i = 0; i < teacherCount; i++) {
                        teachers[i].updateStudentCount(students);
                        System.out.println(teachers[i].getDetails());
                        System.out.println();
                    }
                    break;

                case 6:
                    System.out.println("\n--- All Students ---");
                    for (int i = 0; i < studentCount; i++) {
                        System.out.println(students[i].getDetails());
                        System.out.println();
                    }
                    break;

                case 7:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
 class Student {
    private String name;
    private int rollNumber;
    private String[] subjects;

    public Student(String name, int rollNumber, String[] subjects) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.subjects = subjects;
    }

    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public String[] getSubjects() {
        return subjects;
    }

    public String getDetails() {
        StringBuilder sb = new StringBuilder();
        sb.append("StudentMain Name: ").append(name).append("\n");
        sb.append("Roll Number: ").append(rollNumber).append("\n");
        sb.append("Subjects: ");
        for (String sub : subjects) {
            sb.append(sub).append(" ");
        }
        return sb.toString();
    }
}
  class Teacher {
	    private String name;
	    private String[] subjects;
	    private int numberOfStudents;

	    public Teacher(String name, String[] subjects) {
	        this.name = name;
	        this.subjects = subjects;
	        this.numberOfStudents = 0;
	    }

	    public String getName() {
	        return name;
	    }

	    public String[] getSubjects() {
	        return subjects;
	    }

	    public void updateStudentCount(Student[] students) {
	        int count = 0;
	        for (Student s : students) {
	            if (s != null) {
	                for (String sub : s.getSubjects()) {
	                    for (String teachSub : subjects) {
	                        if (sub.equalsIgnoreCase(teachSub)) {
	                            count++;
	                            break;
	                        }
	                    }
	                }
	            }
	        }
	        this.numberOfStudents = count;
	    }

	    public String getDetails() {
	        StringBuilder sb = new StringBuilder();
	        sb.append("Teacher Name: ").append(name).append("\n");
	        sb.append("Subjects Taught: ");
	        for (String sub : subjects) {
	            sb.append(sub).append(" ");
	        }
	        sb.append("\nNumber of Students: ").append(numberOfStudents);
	        return sb.toString();
	    }
	}
  class Subject {
	    private String name;

	    public Subject(String name) {
	        this.name = name;
	    }

	    public String getName() {
	        return name;
	    }
	}


