package e_event.dto;

public class StudentVO {
	
	private String name;
	private String id;
	private String tel;
	private String sex;
	private int age;
	private String home;
	
	// constructor
	public StudentVO() {		//기본생성자 함수는 무조건 만들어 두자
		
	}
	
//	public StudentVO(String name, String id, String tel, String gender, int age, String home) {
//		super();
//		this.name = name;
//		this.id = id;
//		this.tel = tel;
//		this.gender = gender;
//		this.age = age;
//		this.home = home;
//	}

	//setter만 만들어 두기
	public void setName(String name) {
		this.name = name;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setHome(String home) {
		this.home = home;
	}

	@Override
	public String toString() {
		return "StudentVO [name=" + name + ", id=" + id + ", tel=" + tel + ", sex=" + sex + ", age=" + age
				+ ", home=" + home + "] \n";
	}

	
	// getter
	public String getName() {
		return name;
	}

	public String getId() {
		return id;
	}

	public String getTel() {
		return tel;
	}

	public String getSex() {
		return sex;
	}

	public int getAge() {
		return age;
	}

	public String getHome() {
		return home;
	}
	
	

}
