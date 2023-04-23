package a_datatype;
/*
 * 	자바의 문자열
 * 
 * 	' String(*)	- 변화가 없을 거 같으면 이거 씀 - 가비지 콜렉터 작동 때문에
 * 	' StringBuffer / StringBuilder - 문자열의 변화가 많을 거 같으면 이거 씀
 * 
 */
public class Ex04_StringBuffer {
	
	public static void main(String[] args) {
		
		// String
		String a = new String("홍길동");
		String b = "안녕";	//유일하게 new 생략 가능한 클래스
		a += b; 	// + 연산자 가능	a = a + b;
		System.out.println(a);
		
		// String Builder(동기화 X) / StringBuffer(동기화 O)
		StringBuilder sb = new StringBuilder("홍길자");
//		StringBuilder sb2 = "안녕";	//클래스라서 new 생략 불가능
//		sb = sb + "안녕";		//+ 연산자 불가능
		sb.append("안녕");	//+ 연산자 대신 이걸 씀
		System.out.println(sb);
		
	}

}
