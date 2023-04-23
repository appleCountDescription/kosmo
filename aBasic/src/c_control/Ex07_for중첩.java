package c_control;

public class Ex07_for중첩 {
	
	public static void main(String[] args) {
		
		int N = 25;
		
//		for(int j=0; j<5 ; j++) 			//5줄
//		{									//5개(열)
//			for(int i=0; i<5; i++)
//			{
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
		
//		for(int j=0; j<5 ; j++) 			//5줄
//		{									//5개(열)
//			for(int i=0; i<5-j; i++)
//			{
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
		
		for(int j=0; j<5 ; j++) 			//5줄
		{									//5개(열)
			for(int i=0; i<j+1; i++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
