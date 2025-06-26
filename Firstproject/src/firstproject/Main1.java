package firstproject;



import java.util.Scanner;

public class Main1 {
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
            System.out.println("1. Add Subject");
            System.out.println("2. Add Teacher");
            System.out.println("3. Add Student");
            System.out.println("4. Show Teacher Info with Student Counts");
            System.out.println("5. Show All Students");
            System.out.println("6. Exit");
            System.out.print("Choice: ");
            int ch = sc.nextInt();
            sc.nextLine();

            switch (ch) {
                case 1:
                    schoolSubjects.addSubjects(sc);
                    break;

                case 2:
                    if (teacherCount < teacherLimit) {
                        Teacher t = new Teacher();
                        System.out.print("Enter Teacher Name: ");
                        t.setName(sc.nextLine());
                        System.out.print("Enter Teacher ID: ");
                        t.setId(sc.nextInt());
                        sc.nextLine();
                        System.out.print("How many subjects does the teacher teach? ");
                        int subCount = sc.nextInt();
                        sc.nextLine();
                        String[] subList = new String[subCount];
                        for (int i = 0; i < subCount; i++) {
                            System.out.print("Enter subject " + (i + 1) + ": ");
                            subList[i] = sc.nextLine();
                        }
                        t.setSubjects(subList);
                        teachers[teacherCount++] = t;
                    } else {
                        System.out.println("Teacher limit reached.");
                    }
                    break;

                case 3:
                    if (studentCount < studentLimit) {
                        Student s = new Student();
                        System.out.print("Enter Student Name: ");
                        s.setName(sc.nextLine());
                        System.out.print("Enter Student Roll No: ");
                        s.setRoll(sc.nextInt());
                        sc.nextLine();
                        System.out.print("How many subjects does student take? ");
                        int scount = sc.nextInt();
                        sc.nextLine();
                        String[] subs = new String[scount];
                        for (int i = 0; i < scount; i++) {
                            System.out.print("Enter subject " + (i + 1) + ": ");
                            subs[i] = sc.nextLine();
                        }
                        s.setSubjects(subs);
                        students[studentCount++] = s;
                    } else {
                        System.out.println("Student limit reached.");
                    }
                    break;

                case 4:
                    System.out.print("Enter teacher name: ");
                    String tname = sc.nextLine();
                    boolean found = false;
                    for (int i = 0; i < teacherCount; i++) {
                        if (teachers[i].getName().equalsIgnoreCase(tname)) {
                            found = true;
                            System.out.println("Teacher Name: " + teachers[i].getName());
                            String[] tSubjects = teachers[i].getSubjects();
                            int totalUniqueStudents = 0;

                            for (String sub : tSubjects) {
                                int subStudentCount = 0;
                                for (int j = 0; j < studentCount; j++) {
                                    String[] stuSubjects = students[j].getSubjects();
                                    for (String stuSub : stuSubjects) {
                                        if (stuSub.equalsIgnoreCase(sub)) {
                                            subStudentCount++;
                                            break;
                                        }
                                    }
                                }
                                totalUniqueStudents += subStudentCount;
                                System.out.println("- " + sub + " (Students: " + subStudentCount + ")");
                            }

                            System.out.println("Number of Subjects: " + tSubjects.length);
                            System.out.println("Number of Students Taught: " + totalUniqueStudents);
                        }
                    }
                    if (!found) {
                        System.out.println("Teacher not found.");
                    }
                    break;

                case 5:
                    for (int i = 0; i < studentCount; i++) {
                        System.out.println(students[i].displayStudent());
                    }
                    break;

                case 6:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
 

  class Student {
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
 

 class Teacher {
    private String name;
    private int id;
    private String[] subjects;

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSubjects(String[] subjects) {
        this.subjects = subjects;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String[] getSubjects() {
        return subjects;
    }

    public int getSubjectCount() {
        return (subjects == null) ? 0 : subjects.length;
    }

    public String displayTeacher(int studentCount) {
        return "ID: " + id + " | Name: " + name +
               "\nSubjects Teach: " + getSubjectList() +
               "\nStudents Taught: " + studentCount +
               "\nNumber of Subjects: " + getSubjectCount();
    }

    private String getSubjectList() {
        if (subjects == null || subjects.length == 0) return "None";
        StringBuilder sb = new StringBuilder();
        for (String sub : subjects) {
            sb.append(sub).append(", ");
        }
        return sb.substring(0, sb.length() - 2);
    }
}
 

 class Subject {
    private String[] subjects;

    public void addSubjects(Scanner sc) {
        System.out.print("How many subjects are in school? ");
        int n = sc.nextInt();
        sc.nextLine();
        subjects = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter subject " + (i + 1) + ": ");
            subjects[i] = sc.nextLine();
        }
    }

    public void displaySubjects() {
        if (subjects == null || subjects.length == 0) {
            System.out.println("No subjects added.");
            return;
        }
        System.out.println("Subjects offered:");
        for (String subject : subjects) {
            System.out.println(subject);
        }
    }

    public String[] getSubjects() {
        return subjects;
    }
}

