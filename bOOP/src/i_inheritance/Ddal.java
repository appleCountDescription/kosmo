package i_inheritance;

/*
 * 	상속관계: 부모-자식
 * 
 * 	ex) extends Umma: Umma 클래스를 부모로 삼음
 */

public class Ddal extends Umma{
	
	public Ddal() {
		System.out.println("엄마생성");
	}
	
	public void gene() {
		System.out.println("자식입니다");
	}
	public void study() {
		System.out.println("딸은 학생");
	}
}
