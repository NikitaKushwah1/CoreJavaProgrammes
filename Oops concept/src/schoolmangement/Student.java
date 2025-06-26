 package schoolmangement;

public class Student {
    private int roll;
    private String name;
    private int std;

    
    public void setRoll(int roll) {
        this.roll = roll;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStd(int std) {
        this.std = std;
    }

    
    public int getRoll() {
        return roll;
    }

    public String getName() {
        return name;
    }

    public int getStd() {
        return std;
    }

     
    public String displayStudent() {
        return "Roll No: " + roll + " | Name: " + name  ;
    }

     
//    public static int deleteStudentByName(StudentMain[] students, int count, String targetName) { 
//    	for (int i = 0; i < count; i++) {
//    
//          if (students[i].name.equalsIgnoreCase(targetName)) {
//              for (int j = i; j < count - 1; j++) {
//                   students[j] = students[j + 1];
//                }
//               return count - 1;
//          }
//      }
//       return count;    }
//
//    
//    public static String searchStudentByName(StudentMain[] students, int count, String name) {
//       for (int i = 0; i < count; i++) {
//            if (students[i].name.equalsIgnoreCase(name)) {
//                return "StudentMain Found: " + students[i].displayStudent();
//           }
//       }
//       return "StudentMain not found.";
//    }
//
//   
//   public static String updateStudentName(StudentMain[] students, int count, String oldName, String newName) {
//       for (int i = 0; i < count; i++) {
//
//    	   
//    	   if (students[i].name.equalsIgnoreCase(oldName)) {
//               students[i].setName(newName);
//               return "StudentMain name updated.";
//           }
//       }
//       return "StudentMain not found.";
// }
}
