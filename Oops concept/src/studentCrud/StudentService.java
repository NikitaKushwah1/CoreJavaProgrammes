package studentCrud;
import java.util.Scanner;
public class StudentService {
	
	Student s = new Student();
	
	 public Student addStudent(Scanner sc)
	 { 
		 System.out.println("== Add StudentMain ==");
		 return saveStudent(sc);
	 }
	 
public static  void displayStudent(Student[] studentList)
{ 
	System.out.println("== display StudentMain ==");
	getStudent(studentList);
}
public static int deleteById(Student[] studentList, int count, int targetId)
{  
	System.out.println("== Delete StudentMain ==");
	return deleteStudentById(studentList,count,targetId);
}

private static Student saveStudent(Scanner sc) {
	 
	Student sb = new Student();
	 
	System.out.print("Enter Student Name: ");
   sb.setName(sc.nextLine());
   
   if(sb.getName() == null || sb.getName().trim().isEmpty()  )
   {
	   throw new IllegalArgumentException("Name  is invalid");
   }
    System.out.print("Enter StudentMain Rool No: ");
    sb.setRoll(sc.nextInt());
   if( sb.getRoll()<=0) {
	   throw new IllegalArgumentException(" Roll no is invalid");
   }
   return sb;
}

private static void getStudent(Student[] studentList) {
	if(studentList == null || studentList.length == 0) {
			 throw new IllegalArgumentException("StudnetList can not null");
		 }
	for(Student std: studentList) {
		 if(std!=null) {
		 System.out.println("Name :" +std.getName());
	     System.out.println( "Rool No: " +std.getRoll());
			 }
		 }
	}
private static int deleteStudentById( Student[] studentList, int count, int targetId) {
       if(targetId <=0) {
	      throw new RuntimeException("invalid id");
	     }
	  for (int i = 0 ;i<count;i++) {
		 if(studentList[i].getRoll()==targetId){
				for (int j = i;j<count-1;j++) {
			 studentList[j] = studentList[j+1];
			}
			  studentList[count-1] = null;
			  return count-1;
		}
		}
		return count;
}
 }















