package i_exercise2;

public class Student extends Human {
	
	protected String number;
	protected String major;
	
	public Student() {
		this("홍길동", 20, 171, 81, "201101", "영문");
	}
	
	public Student(String name, int age, int height, int weight, String number, String major) {
		super(name, age, height, weight);		
		this.number = number;
		this.major = major;
	}
	
	public void printInformation() {
		System.out.println(name + ' ' + age + ' ' + height + ' ' + weight + ' ' + number + ' ' + major + ' ');
	}

}
