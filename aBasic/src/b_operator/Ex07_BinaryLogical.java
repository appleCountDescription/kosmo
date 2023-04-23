package b_operator;

/*
 * 	이진논리
 * 
 * 	A	B	A&B	 A|B  A^B     ^ : exclusive or - 다른 신호가 왔을 때만
 *  -----------------------
 * 	0	0	0	 0	  0
 * 	0	1	0	 1	  1
 * 	1	0	0	 1	  1
 * 	1	1	1	 1	  0
 */

public class Ex07_BinaryLogical {

	public static void main(String[] args) {
	
		int a = 10; // 00001010 (8+2)
		int b = 15; // 00001111 (8+4+2+1)
		
		int and = a & b;
		int or = a | b;
		int ex = a ^ b;
		
		System.out.println(and); // 10
		System.out.println(or); // 15
		System.out.println(ex); // 5

	}

}
