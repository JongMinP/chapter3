package chapter03;

public class Student extends Person {

	public Student() {
//		super(30);
	}
	
	public Student(int age) {
		super(age);
		System.out.println("Student() called");
	}
	
	public void set() {

		// public
		name = "둘리";

		// protected
		height = 150;

		// deault
		age = 37;
		
		// private
//		weight = 40;
	}
}
