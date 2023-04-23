package a_basic;

import java.util.Arrays;

public class CloneEx {
	
	public static void main(String[] args) {
		// 얕은 복사 - 같은 주소를 참조하니깐, 복사본에서 수정작업이 생길 때 원본에 영향을 미침
		String[] array = {"안녕", "하이", "올라", "곤니찌와"};
		String[] copy = array;
		
		System.out.println(Arrays.toString(array));		// 스태틱임
		System.out.println(Arrays.toString(copy));
		
		System.out.println("동일주소: " + (array==copy));
		
//		copy[3] = "방가";
//		System.out.println(Arrays.toString(array));		
//		System.out.println(Arrays.toString(copy));
		
		// 깊은 복사 - 내용을 복사함
		String[] clone = array.clone();
		System.out.println("동일주소: " + (array==copy));
		
		System.out.println(Arrays.toString(array));
		System.out.println(Arrays.toString(copy));
		clone[3] = "방가";
		System.out.println(Arrays.toString(array));
		System.out.println(Arrays.toString(copy));
	}

}
