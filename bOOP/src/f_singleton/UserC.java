package f_singleton;

public class UserC {
	
	DBConnect con;
	
	public UserC() {
		con = DBConnect.getInstance();
	}
	
	public void use() {
		System.out.println("C 작업중");
	}

}
