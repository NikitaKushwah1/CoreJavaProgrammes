package schoolmanagement3;
import java.util.Scanner;
public class Teacher {
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
//    public static void addTeacher()
//    {
//    	System.out.print("Enter teacher name: ");
//        String tname = sc.nextLine();
//        boolean found = false;
//        for (int i = 0; i < teacherCount; i++) {
//            if (teachers[i].getName().equalsIgnoreCase(tname)) {
//                found = true;
//                System.out.println("Teacher Name: " + teachers[i].getName());
//                String[] tSubjects = teachers[i].getSubjects();
//                int totalUniqueStudents = 0;
//
//                for (String sub : tSubjects) {
//                    int subStudentCount = 0;
//                    for (int j = 0; j < studentCount; j++) {
//                        String[] stuSubjects = students[j].getSubjects();
//                        for (String stuSub : stuSubjects) {
//                            if (stuSub.equalsIgnoreCase(sub)) {
//                                subStudentCount++;
//                                break;
//                            }
//                        }
//                    
//    }
//       }
//        }
//    
    
//     public static void HowManyStudentTeachByThisteacher(int totaluniquestudents , String[]teachers)
//     { Scanner sc = new Scanner(System.in);
//    	 System.out.println("Enter teacher name");
//    	 String Tname = sc.nextLine();
//    	 for(int i = 0;i<teachers.length;i++)
//    	 {
//    		 if( teachers[i].getName().equalsIgnoreCase(Tname))
//    		 {
//    			 System.out.println("Teacher" + Tname + "teaches" + totaluniquestudents);
//    		 }
//    	 }
//     }

//    public String displayTeacher(int studentCount) {
//        return "ID: " + id + " | Name: " + name +
//               "\nSubjects Teach: " + getSubjectList() +
//               "\nStudents Taught: " + studentCount +
//               "\nNumber of Subjects: " + getSubjectCount();
//    }
//
//    private String getSubjectList() {
//        if (subjects == null || subjects.length == 0) return "None";
//        StringBuilder sb = new StringBuilder();
//        for (String sub : subjects) {
//            sb.append(sub).append(", ");
//        }
//        return sb.substring(0, sb.length() - 2);
//    }
}
 