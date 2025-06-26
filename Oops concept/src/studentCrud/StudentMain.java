package studentCrud;

 import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentMain {
	
 public static void main(String[] args){  
	 Scanner sc = new Scanner(System.in);
	 Student[] studentList = new Student[10];
     int studentCount = 0;
     StudentService studentService = new StudentService();
      
	     while (true) {
	          
	         try {
	         System.out.println("1.Save StudentMain");
	         System.out.println("2. get StudentMain");
	         System.out.println("3. delete StudentMain");
	         System.out.print("Choice: ");
	         int choice = sc.nextInt();
	         sc.nextLine();
	         switch (choice) {
	         case 1:
	        	
	        	try {
	        		if (studentCount < 10) {
	        		Student student= studentService.addStudent(sc);
	        		studentList[studentCount++] = student;
	        		} else{    
	           		 System.out.println("Student   is not present");
	        		}
	        	}
	        	catch (InputMismatchException e) {
                    sc.nextLine();  
                    System.out.println("Invalid input for roll number.");
                    
	        	}
	        	 catch(IllegalArgumentException e) {
	        	    	System.out.println("Error :  " + e.getMessage());
	        	 }
	        break;
       
	         case 2:
        	
        	try {
        		if (studentCount == 0) {
              System.out.println("No students to display.");
        		} else {
        	        studentService. displayStudent(studentList);
        	    }
	         }
         catch(Exception e) {
        	 System.out.println("Error displaying student:  " +e.getMessage());
         }
 	 
          break;
       case 3:
       	
    	 try {   
    		 System.out.print("Enter student ID to delete: ");
    	     int deleteId = sc.nextInt();
    	     sc.nextLine();
    	     int newStudentCount = studentService.deleteById(studentList, studentCount, deleteId);
             if (newStudentCount < studentCount) {
              System.out.println("StudentMain deleted.");
              studentCount = newStudentCount;
            } else {
               System.out.println("Student not found.");
            }
    	  }
          catch(Exception e) {
        	  
            sc.nextLine();
        	 System.out.println(" Invalid id :   " +e.getMessage());
         }
        	 break;
          
       default:
          	System.out.println("Not valid");
	         }
	        }
	         catch (InputMismatchException e) {
	               sc.nextLine();
	        	 System.out.println("Error: Please enter a valid number for menu choice!");
	                }
	         
}
	
 }
}
 


