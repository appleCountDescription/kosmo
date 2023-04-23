package c_control;
/*
 * 	break: 블럭 바깥으로 벗어날 때
 * 	continue: 블럭 안쪽 끝으로 이동(점핑)
 */

public class Ex15_break_continue {
	
	public static void main(String[] args) {
		
		END: 	//라벨: 반복문을 아예 끝내버리기
		for(int i=0; i<2; i++)
		{
			for(int j=0; j<3; j++)
			{
				if(j==1) continue; 	
				if(j==1) break;
				if(j==1) break END;
				System.out.printf("<%d,%d> \n", i, j);
			} // end of j for
			System.out.println("데이터");
		} // end of i for
		
	}

}
