package f_singleton;

public class UserB {
	
	DBConnect con;
	
	public UserB() {
		con = DBConnect.getInstance();
	}
	
	public void use() {
		System.out.println("B 작업중");
	}

}
