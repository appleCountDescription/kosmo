package z_연습;

import java.util.Arrays;
import java.util.Scanner;

public class GradeTest {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("데이터의 수를 입력: ");
		int su = sc.nextInt();
		int[] data = new int[su];
		
		for(int i=0; i<su; i++) {
			data[i] = sc.nextInt();
		}
		
		GradeExpr grade = new GradeExpr(data);
		
		System.out.println("점수들: " + grade.toString());
		System.out.println("총점: " + grade.getTotal());
		System.out.println("평균: " + grade.getAverage());
		System.out.println("최고점수: " + grade.getGoodScore());
		System.out.println("최저점수: " + grade.getBadScore());
	}
}
