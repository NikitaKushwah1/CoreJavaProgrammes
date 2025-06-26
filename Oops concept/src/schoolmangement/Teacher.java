 package schoolmangement;

public class Teacher {
    private String name;
    private int id;
    private String[] subjects;

    public void setName(String name) {
        this.name = name;
    }

    public void setid(int id) {
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

    public String displayTeacher(int totalStudents) {
        return "ID: " + id + " | Name: " + name +
               "\nSubjects Teach: " + getSubjectList() +
               "\nStudents Taught: " + totalStudents +
               "\nNumber of Subjects: " + getSubjectCount();
    }

    private String getSubjectList() {
        if ( subjects.length == 0) 
        	{return "None";}
        StringBuilder sb = new StringBuilder();
        for (String sub : subjects) {
            sb.append(sub);
        }
        return sb.substring(0, sb.length() - 2);
    }

    public int getSubjectCount() {
        return (subjects == null) ? 0 : subjects.length;
    }

    public static int deleteTeacherByName(Teacher[] teachers, int count, String targetName) {
       for (int i = 0; i < count; i++) {
           if (teachers[i].name.equalsIgnoreCase(targetName)) {
               for (int j = i; j < count - 1; j++) {
                  teachers[j] = teachers[j + 1];
              }
             return count - 1;
         }
     }
       return count;
   }

    public static String searchTeacherByName(Teacher[] teachers, int count, String name, int studentCount) {
        for (int i = 0; i < count; i++) {
            if (teachers[i].name.equalsIgnoreCase(name)) {
                return "Teacher Found:\n" + teachers[i].displayTeacher(studentCount);
            }
        }
        return "Teacher not found.";
    }

    public static String updateTeacherName(Teacher[] teachers, int count, String oldName, String newName) {
        for (int i = 0; i < count; i++) {
            if (teachers[i].name.equalsIgnoreCase(oldName)) {
                teachers[i].setName(newName);
                return "Teacher name updated.";
            }
        }
        return "Teacher not found.";
    }
}
