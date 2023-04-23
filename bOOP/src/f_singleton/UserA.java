package f_singleton;

import e_static.Book;

public class UserA {
	
	DBConnect con;
	
	public UserA() {
		con = DBConnect.getInstance();
	}
	
	public void use() {
		System.out.println("A 작업중");
	}

}
