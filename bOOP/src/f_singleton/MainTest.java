package f_singleton;

import e_static.Book;

public class MainTest {

	public static void main(String[] args) {	// MainTest.main(); 클래스 MainTest 내의 main함수 호출 
		
		UserA a = new UserA();
		a.use();
		
		UserB b = new UserB();
		b.use();
		
		UserC c = new UserC();
		c.use();
	}

}
