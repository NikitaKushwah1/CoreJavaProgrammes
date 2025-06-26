//package schoolmanagement3;
//
//import java.util.Scanner;
//
// 
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter max number of teachers: ");
//        int teacherLimit = sc.nextInt();
//        sc.nextLine();
//        Teacher[] teachers = new Teacher[teacherLimit];
//        int teacherCount = 0;
//
//        System.out.print("Enter max number of students: ");
//        int studentLimit = sc.nextInt();
//        sc.nextLine();
//        StudentMain[] students = new StudentMain[studentLimit];
//        int studentCount = 0;
//
//        Subject schoolSubjects = new Subject();
//
//        while (true) {
//            System.out.println("\n--- School Management System ---");
//            System.out.println("1. Add Subject");
//            System.out.println("2. Add Teacher");
//            System.out.println("3. Add StudentMain");
//            System.out.println("4. Show Teacher Info with StudentMain Counts");
//            System.out.println("5. Show All Students");
//            System.out.println("6. Show All Subjects");
//            System.out.println("8. How many students teach by this teacher");
//            
//            System.out.println("7. Exit");
//            System.out.print("Choice: ");
//            int ch = sc.nextInt();
//            sc.nextLine();
//
//            switch (ch) {
//                case 1:
//                    schoolSubjects.addSubjects(sc);
//                    break;
//
//                case 2:
//                    if (teacherCount < teacherLimit) {
//                        Teacher t = new Teacher();
//                        System.out.print("Enter Teacher Name: ");
//                        t.setName(sc.nextLine());
//                        System.out.print("Enter Teacher ID: ");
//                        t.setId(sc.nextInt());
//                        sc.nextLine();
//                        System.out.print("How many subjects does the teacher teach? ");
//                        int subCount = sc.nextInt();
//                        sc.nextLine();
//                        String[] subList = new String[subCount];
//                        for (int i = 0; i < subCount; i++) {
//                            System.out.print("Enter subject " + (i + 1) + ": ");
//                            subList[i] = sc.nextLine();
//                        }
//                        t.setSubjects(subList);
//                        teachers[teacherCount++] = t;
//                    } else {
//                        System.out.println("Teacher limit reached.");
//                    }
//                    break;
//
//                case 3:
//                    if (studentCount < studentLimit) {
//                        StudentMain s = new StudentMain();
//                        System.out.print("Enter StudentMain Name: ");
//                        s.setName(sc.nextLine());
//                        System.out.print("Enter StudentMain Roll No: ");
//                        s.setRoll(sc.nextInt());
//                        sc.nextLine();
//                        System.out.print("How many subjects does student take? ");
//                        int scount = sc.nextInt();
//                        sc.nextLine();
//                        String[] subs = new String[scount];
//                        for (int i = 0; i < scount; i++) {
//                            System.out.print("Enter subject " + (i + 1) + ": ");
//                            subs[i] = sc.nextLine();
//                        }
//                        s.setSubjects(subs);
//                        students[studentCount++] = s;
//                    } else {
//                        System.out.println("StudentMain limit reached.");
//                    }
//                    break;
//
//                case 4:
//                    System.out.print("Enter teacher name: ");
//                    String tname = sc.nextLine();
//                    boolean found = false;
//                    for (int i = 0; i < teacherCount; i++) {
//                        if (teachers[i].getName().equalsIgnoreCase(tname)) {
//                            found = true;
//                            System.out.println("Teacher Name: " + teachers[i].getName());
//                            String[] tSubjects = teachers[i].getSubjects();
//                            int totalUniqueStudents = 0;
//
//                            for (String sub : tSubjects) {
//                                int subStudentCount = 0;
//                                for (int j = 0; j < studentCount; j++) {
//                                    String[] stuSubjects = students[j].getSubjects();
//                                    for (String stuSub : stuSubjects) {
//                                        if (stuSub.equalsIgnoreCase(sub)) {
//                                            subStudentCount++;
//                                            break;
//                                        }
//                                    }
//                                }
//                                totalUniqueStudents += subStudentCount;
//                                System.out.println("- " + sub + " (Students: " + subStudentCount + ")");
//                            }
//
//                            System.out.println("Number of Subjects: " + tSubjects.length);
//                            System.out.println("Number of Students Teach: " + totalUniqueStudents);
//                        }
//                    }
//                    if (!found) {
//                        System.out.println("Teacher not found.");
//                    }
//                    break;
//
//                case 5:
//                    for (int i = 0; i < studentCount; i++) {
//                        System.out.println(students[i].displayStudent());
//                    }
//                    break;
//               
//                case 6 :
//                	schoolSubjects.displaySubjects();
//                    break;
//                case 8:
//                	Teacher.HowManyStudentTeachByThisteacher( totalUniqueStudents,teachers);
//                case 7:
//                    System.out.println("Exiting...");
//                    sc.close();
//                    return;
//
//                default:
//                    System.out.println("Invalid choice.");
//            }
//        }
//    }
//}
// 