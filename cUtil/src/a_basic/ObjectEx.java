package a_basic;

class Student {		// 이 클래스의 부모는 Object임
	String hakbun, name;
	Student(String _hakbun, String _name){	//생성자함수
		hakbun = _hakbun;	//멤버변수(언더바 X)와 지역변수(언더바 O) 구별 위해
		name = _name;
	}

	public String toString() {	//오버라이드
		return "[" + hakbun + "]" + name + "님";
	}
	public boolean equals(Object obj) {
		Student ss = (Student)obj;
		String 학번 = ss.hakbun;
		if(hakbun.equals(학번)) {		// if (hakbun.equals(((Student)obj).hakbun)) 해도 됨
									// if (hakbun.equals(ss.hakbun)) 해도 됨
			return true;
		}else {
			return false;
		}
	}

}
public class ObjectEx {	//파일명: 메인함수명이어야 함
	public static void main(String[] args) {
		Student s = new Student("01234", "홍길동");
		Student s2 = new Student("01234", "맹길자");
//		System.out.println(s);	// Object 클래스의 toString
		
		if(s.equals(s2))
			System.out.println("동일학번-동일인");
		else
			System.out.println("타인");
	}
}
