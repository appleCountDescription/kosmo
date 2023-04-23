package i_exercise2;

public class Student2_prof extends Human2_prof {
	
	private String number;
	private String major;
	
	public Student2_prof() {
	}
	
	public Student2_prof(String name, int age, int height, int weight, String number, String major) {
		super(name, age, height, weight);		//private 호출 방법1
		this.number = number;
		this.major = major;
	}
	
	public String printInformation() {
		return super.printInformation() + number + " " + major;		//private 호출 방법2
	}

}
