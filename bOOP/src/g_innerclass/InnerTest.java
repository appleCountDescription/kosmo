package g_innerclass;

class Outer{	//하나의 자바파일 안에 클래스 여러 개 있어도 됨, 하지만 나중에 클래스 어딨는지 찾기 힘들어서 그렇게 하진 않음
	class Inner{		//하나의 멤버로 보면 됨, 그래서 여기에는 static을 붙여도 됨
	// static Class Inner
		void java() {
		// static void java
			System.out.println("잡아라");
		}
	}
}

public class InnerTest {

	public static void main(String[] args) {
		Outer o = new Outer();
		Outer.Inner in = o.new Inner();
		//Outer.Inner in = new Outer.Inner();
		in.java();
		
		//Outer.Inner.java();
	}

}
