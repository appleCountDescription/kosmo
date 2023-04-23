package h_access.sub;

/*
 * 	접근지정자
 * 
 * 	private: 해당 클래스 안에서만 접근
 * 	public: 모든 접근 허용
 * 	(default): 해당 패키지 안에서만 접근
 * 	protected: 다른 패키지인 경우 상속관계에서 접근이 가능함
 * 
 */

public class Access {
	private String a = "프라이빗 데이타";
	public String b = "퍼블릭 데이타";
	protected String c = "프로텍티드 데이타";
	String d = "디폴트 데이타";	// 아무것도 안 쓰는 게 디폴트
	
	public void output() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}

}
