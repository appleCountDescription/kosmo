package b_operator;

public class Ex09_정리 {

	public static void main(String[] args) {

		int z = 10 - 7 ^ 3 + 1 * 2 & 4 ;
		
		/*
		 *  10 - 7 ^ 3 + 2 & 4
		 *  3 ^ 5 & 4  <= *********** &가 ^보다 먼저
		 *  
		 */
		
		System.out.println(z); // 4

	}

}
