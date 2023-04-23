package c_sansok;

public class 결과받기2 {
	
	public static void main(String[] args) {
		
		Object[] info = dataset();
		//출력
		for(int i=0; i<info.length; i++) {
			System.out.println(info[i]);
		}
		
		
	}
	
	static Object[] dataset() {
		String name = "홍길동";
		int age = 33;	// int age = 33;
		double height = 130.99;
		
		Object[] info = {name, age, height};	// 부모가 Object
		return info;
		
	}

}
