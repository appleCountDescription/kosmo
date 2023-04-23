package k_final;

/*
 * 	final: 변경불가
 * 			- 변수(필드): 수정 못함
 * 			- 메소드: 오버라이딩 못함
 * 			- 클래스: 부모클래스가 될 수 없음
 */



import java.lang.*;

final class Parent{	// final 있으니 부모가 될 수 없음
	final String field = "부모님꺼";
	public final void jib() {
		System.out.println("부모님이 만드신 거");
	}
}
class Child {
	Child(){
		//field = "내꺼";
	}
//	public void jib() {
//		System.out.println("부모님 꺼 내가 탕진");
//	}
}

//public class Test {
//	public static void main(String[] args) {
//		Parent p = new Child();
//		System.out.println(p.field);
//		p.jib();
//	}
//
//}
