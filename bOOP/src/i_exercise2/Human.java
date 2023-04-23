package i_exercise2;

public class Human {
	
	protected String name;
	protected int age;
	protected int height;
	protected int weight;
	
	public Human() {
		this("고다인", 29, 165, 68);
	}
	
	public Human(String name, int age, int height, int weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	public void printInformation() {
		System.out.println(name + ' ' + age + ' ' + height + ' ' + weight);
	}

}
