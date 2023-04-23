package h_access;

import h_access.sub.Access;		//	다른 패키지에 있는 클래스 가져옴

public class OtherPackage {
	public static void main(String[] args) {
		
		Access acc = new Access();
		//acc.a = "프라이빗 변경";	// 프라이빗은 변경 못함
		acc.b = "퍼블릭 변경";	// 패키지가 다르면 퍼블릭만 접근 가능
		//acc.c = "프로텍티드 변경";
		//acc.d = "디폴트 변경";
		acc.output();
	}

}
