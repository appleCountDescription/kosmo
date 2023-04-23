package dinfo.model.vo;

public class InfoVO {	// DTO(데이터전송객체)와 비슷함
	
	//멤버변수
	private String tel;//전화번호
	private String name;//이름
	private String id;//주민번호
	private String sex;//성
	private int age;//나이
	private String home;//주소
	
	public InfoVO() {}
	
	public InfoVO(String tel, String name, String id, String sex, int age, String home) {
		super();
		this.tel = tel;
		this.name = name;
		this.id = id;
		this.sex = sex;
		this.age = age;
		this.home = home;
	}

	// setter, getter
	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getHome() {
		return home;
	}

	public void setHome(String home) {
		this.home = home;
	}

	@Override
	public String toString() {
		return "InfoVO [tel=" + tel + ", name=" + name + ", id=" + id + ", sex=" + sex + ", age=" + age + ", home="
				+ home + "]";
	}
	
	
	
}
