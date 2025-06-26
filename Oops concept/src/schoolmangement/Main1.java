package schoolmangement;

 

import java.util.Scanner;

public class Main1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter max number of teachers: ");
        int teacherLimit = sc.nextInt();
        sc.nextLine();
        Teacher[] teachers = new Teacher[teacherLimit];
        int teacherCount = 0;

        System.out.print("Enter max number of students: ");
        int studentLimit = sc.nextInt();
        sc.nextLine();
        Student[] students = new Student[studentLimit];
        int studentCount = 0;

        Subject schoolSubjects = new Subject();

        while (true) {
            System.out.println("\n--- School Management System ---");
            System.out.println("1. Add Teacher");
            System.out.println("2.  Add student");
            System.out.println("3. Delete Teacher by Name");
            System.out.println("4. Show All Teachers");
            System.out.println("5. Show All Students");
            System.out.println("6. Delete StudentMain by ID");
            System.out.println("7. Add Subjects");
            System.out.println("8. Show Subjects");
            System.out.println("9. Update Teacher Name");
            System.out.println("10. Search Teacher by Name");
            System.out.println("11. Update StudentMain Name");
            System.out.println("12. Search StudentMain by ID");
            System.out.println("14. Show teacher's subjects, subject count, and student count");

            System.out.println("13. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    if (teacherCount < teacherLimit) {
                        Teacher t = new Teacher();
                        System.out.print("Enter Teacher Name: ");
                        t.setName(sc.nextLine());
                        System.out.print("Enter Teacher Id ");
                        t.setid(sc.nextInt());

                        System.out.print("How many subjects does this teacher teach? ");
                        int subjectCount = sc.nextInt();
                        sc.nextLine();
                        String[] subs = new String[subjectCount];
                        for (int i = 0; i < subjectCount; i++) {
                            System.out.print("Enter Subject " + (i + 1) + ": ");
                            subs[i] = sc.nextLine();
                        }
                        t.setSubjects(subs);
                        teachers[teacherCount++] = t;
                    } else {
                        System.out.println("Teacher limit reached.");
                    }
                    break;

                case 2:
                    if (studentCount < studentLimit) {
                        Student s = new Student();
                        System.out.print("Enter StudentMain Name: ");
                        s.setName(sc.nextLine());
                        System.out.print("Enter StudentMain ID: ");
                        s.setRoll(sc.nextInt());
                        sc.nextLine();
                        students[studentCount++] = s;
                    } else {
                        System.out.println("StudentMain limit reached.");
                    }
                    break;

                case 3:
                    System.out.print("Enter teacher name to delete: ");
                    String delName = sc.nextLine();
                    int newTeacherCount = Teacher.deleteTeacherByName(teachers, teacherCount, delName);
                    if (newTeacherCount < teacherCount) {
                        System.out.println("Teacher deleted.");
                        teacherCount = newTeacherCount;
                    } else {
                        System.out.println("Teacher not found.");
                    }
                    break;

                case 4:
                    if (teacherCount == 0) {
                        System.out.println("No teachers to display.");
                    } else {
                        for (int i = 0; i < teacherCount; i++) {
                            System.out.println("\nTeacher #" + (i + 1));
                            System.out.println(teachers[i].displayTeacher(studentCount));
                        }
                    }

                case 5:
                    if (studentCount == 0) {
                        System.out.println("No students to display.");
                    } else {
                        for (int i = 0; i < studentCount; i++) {
                            System.out.println(students[i].displayStudent());
                        }
                    }
                    break;

//               case 6:
//                  System.out.print("Enter student ID to delete: ");
//                  int delId = sc.nextInt();
//                  sc.nextLine();
//                 int newStudentCount = StudentMain.deleteStudentById(students, studentCount, delId);
//                 if (newStudentCount < studentCount) {
//                     System.out.println("StudentMain deleted.");
//                     studentCount = newStudentCount;
//                 } else {
//                  System.out.println("StudentMain not found.");               }
//               break;

                case 7:
                    schoolSubjects.addSubjects(sc);
                    break;

                case 8:
                    schoolSubjects.displaySubjects();
                    break;

                case 9:
                    System.out.print("Enter current teacher name: ");
                    String oldName = sc.nextLine();
                    System.out.print("Enter new name: ");
                    String newName = sc.nextLine();
                    System.out.println(Teacher.updateTeacherName(teachers, teacherCount, oldName, newName));
                    break;

                case 10:
                    System.out.print("Enter teacher name to search: ");
                    String searchT = sc.nextLine();
                    System.out.println(Teacher.searchTeacherByName(teachers, teacherCount, searchT, studentCount));
                    break;

//                case 11:
//                    System.out.print("Enter student ID to update: ");
//                    int stuId = sc.nextInt();
//                    sc.nextLine();
//                    System.out.print("Enter new student name: ");
//                    String newStuName = sc.nextLine();
//                    System.out.println(StudentMain.updateStudentName(students, studentCount, stuId, newStuName));
//                    break;

//                case 12:
//                    System.out.print("Enter student ID to search: ");
//                    int sid = sc.nextInt();
//                    sc.nextLine();
//                    System.out.println(StudentMain.searchStudentById(students, studentCount, sid));
//                    break;
                case 14:
                    System.out.print("Enter teacher name to show details: ");
                    String tname = sc.nextLine();
                    boolean found = false;
                    for (int i = 0; i < teacherCount; i++) {
                        if (teachers[i].getName().equalsIgnoreCase(tname)) {
                            System.out.println("\nTeacher Name: " + teachers[i].getName());
                            System.out.println("Subjects Taught: ");
                            String[] subjects = teachers[i].getSubjects();
                            if (subjects != null) {
                              for (String sub : subjects) {
                                  System.out.println("- " + sub);
                              }
                            	
                            	 

                            } else {
                                System.out.println("No subjects assigned.");
                            }
                            System.out.println("Number of Subjects: " + teachers[i].getSubjectCount());
                            System.out.println("Number of Students Taught: " + studentCount);
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Teacher not found.");
                    }
                    break;


                case 13:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}



