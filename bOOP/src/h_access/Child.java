package h_access;

import h_access.sub.Access;
// 상속관계인 경우

public class Child extends Access {
	
	public static void main(String[] args) {
		
		Child jasik = new Child();
		//jasik.a = "프라이빗 변경";	//프라이빗은 변경 못함
		jasik.b = "퍼블릭 변경";
		jasik.c = "프로텍티드 변경";
		//jasik.d = "디폴트 변경";
		jasik.output();
	}

}
