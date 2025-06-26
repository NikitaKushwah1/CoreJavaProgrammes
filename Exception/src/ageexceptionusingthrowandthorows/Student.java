package ageexceptionusingthrowandthorows;

public class Student {
	
	private String name;
	private int age ;
	
	public Student(String name) {
		this.name = name;
	}
   
	public void setAge(int age) throws AgeException{
		if(age<0 || age>100) {
			throw new AgeException("Invalid age :"  + age + " . Age should be 0-100");
			}
		this.age = age;
        System.out.println(name + " ki age set ho gayi: " + age);
	}
        public void showInfo() {
            System.out.println("Name: " + name + ", Age: " + age);
        }
	
	}
	

