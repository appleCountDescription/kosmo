package i_exercise2;

public class Human2_prof {
	
	private String name;
	private int age;
	private int height;
	private int weight;
	
	public Human2_prof() {
	}
	
	public Human2_prof(String name, int age, int height, int weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	public String printInformation() {
		System.out.println(name + ' ' + age + ' ' + height + ' ' + weight);
		return name + " " + age + " " + height + " " + weight;
	}

}
