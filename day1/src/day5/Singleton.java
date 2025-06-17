package day5;

//import java.util.Scanner;

class Student{
	private int id;
	private String name;
	private char gender;
	private String branch;
	private static Student person;
	    
	    private Student() {
	        System.out.println("Person object is created");
	    }
	    
	    public static Student createStudentDetails() {
	        if (person == null) {
	            person = new Student();
	        }
	        return person;
	    }
		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public char getGender() {
			return gender;
		}

		public void setGender(char gender) {
			this.gender = gender;
		}

		public String getBranch() {
			return branch;
		}

		public void setBranch(String branch) {
			this.branch = branch;
		}
		  @Override
		    public String toString() {
		        return "Student Details = Id:" + id + ", Name:" + name +
		         ", Gender:" + gender + ", Branch:" + branch;
		    }
}
public class Singleton {
	public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
		Student student1 = Student.createStudentDetails();
		student1.setId(101);
        student1.setGender('M');
        System.out.println(student1); // System.out.print(person.toString());
        
        Student student2 = Student.createStudentDetails();
        System.out.println(student2); // System.out.print(person.toString());
        student2.setId(102);
        System.out.println(student1); // System.out.print(person.toString());
        System.out.println(student2);
    }
}
