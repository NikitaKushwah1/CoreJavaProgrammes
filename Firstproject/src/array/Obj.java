package array;
 class Student
 {
	 public int roll_no;
	 public String name;
	 
	 Student(int roll_no,String name)
	 {
		 this.roll_no = roll_no;
		 this.name = name;
		 
	 }
 }
public class Obj {
	public static void main(String[]args)
	{
		Student[] arr;
		arr = new Student[5];
		arr[0] = new Student (1,"aman");
		arr[1]= new Student(2,"vaibahav");
		arr[2] = new Student(3,"shikar");
		arr[3] = new Student(5,"mohit");
		for(int i = 0;i<arr.length;i++)
		{
			System.out.println(arr[i].roll_no + " " + arr[i].name+"");
		}
	Student b [] = {new Student(1,"namam"),
			        new Student(2,"khaman")
			           };
}
}
