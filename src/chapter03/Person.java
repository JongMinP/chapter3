package chapter03;

public class Person {
	public String name;
	protected int height;
	int age;
	private int weight;
	
	public Person() {}
	
	public Person(int age) {
		this.age = age;
		System.out.println("Person() called");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
