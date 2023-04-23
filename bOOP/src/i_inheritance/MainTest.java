package i_inheritance;

/*
 * 	**클래스 상속관계
 * 	
 * 	[1] 개발 시
 *		- 부모의 멤버 사용
 *		- 부모에 없는 멤버는 추가로 사용하면 됨
 * 		- 부모의 멤버이지만 변경을 한다? => overriding
 * 
 * 	[2] 설계 시
 * 		- 자식클래스의 공통부분을 부모 클래스에 만들기
 */

public class MainTest {
	
	public static void main(String[] args) {
		
		// (1) 각각 클래스
		/*Umma u = new Umma();
		u.gene();
		u.job();
		//u.study();
		
		Ddal d = new Ddal();	
		d.gene();		//오버라이딩이면 딸 것
		d.study();		//오버라이딩이면 딸 것
		d.job();*/ 	// 어차피 엄마가 메모리에 올라옴. 엄마 것인데도 가져다 쓸 수 있음	
		
		// (2) 부모변수에 자식 객체 생성
		Umma u = new Ddal();
		//u.study();	//자식 것은 가져다 못 씀
		u.job();
		u.gene();	//************* overriding - 자식 게 나옴
		
		/*
		(3) 형변환: (casting)
			1) 기본형에서
				int a = (int)3.6;
			2) 클래스에서 상속관계일 경우
				
				
			[주의] 기본형과 참조형끼리는 캐스팅 안 됨
				int a = "10"; (X)
				int b = Integer.parseInt("10");
				
				* Wrapper class
				[기본형]		[참조형]
				int   		Integer
				double		Double
				boolean		Boolean
				long		Long
				
		 */
		
//		String a = new String("오늘도행복");
//		StringBuilder b = (StringBuilder)a;
		
		/*
		Umma a = new Umma();	//메모리에는 엄마만 있음
		Ddal b = (Ddal)a;		//형변환 하려면 상속관계에 있어야 함
		*/
		
		Ddal c = new Ddal();	// 메모리에 이미 딸을 잡아서 엄마도 있는 상황
		Umma d = (Umma)c;		// up casting: c 앞에 (Umma) 안 붙여도 자동으로 캐스팅되는 경우? 메모리에 문제가 안 생겼을 때
		Ddal e = (Ddal)d;		// down casting
		
		// (4)
		if(c instanceof Ddal) {	// instance: 객체, c가 Ddal의 객체니? 물어본 것
			System.out.println("딸 변수");
		}
		
	}

}
