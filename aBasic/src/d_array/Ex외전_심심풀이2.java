package d_array;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex외전_심심풀이2 
{

public static void main(String[] args) 
	{

		Scanner input = new Scanner(System.in);
	
		int tc = input.nextInt(); // 첫번째 줄 테스트케이스
		int n[]=new int[tc]; // 각 테스트케이스 맨 첫 정수(학생 수)가 들어갈 배열
		String sco[]=new String[tc]; // 각 테스트 케이스 별 점수 문자열을 넣을 배열
		int sum[]=new int[tc]; // 각 테스트케이스별 점수 총합을 넣을 배열
		int avr[]=new int[tc]; // 각 테스트케이스별 평균점수를 넣을 배열
		int avrovr[]=new int[tc]; // 각 테스트케이스별 평균보다 높은 점수를 받은 학생수를 넣을 배열
		double avovper[]=new double[tc]; // 각 테스트케이스별 평균보다 높은 점수를 받은 학생수의 비율을 넣을 배열
	
		for(int i=0 ;i<tc ;i++ ) 
		{
			n[i] = input.nextInt(); // 숫자를 입력받아 n[i]에 대입
			sco[i]=input.nextLine(); // 이후 입력받은 문자열 한 줄을 sco[i]에 대입
			int intsco[][] = new int[tc][n[i]]; // 토큰화한 점수들을 넣을 배열
			StringTokenizer tk = new StringTokenizer(sco[i]," "); // 입력받은 문자열을 공백을 기준으로 토큰화
			for(int j=0 ;tk.hasMoreTokens() ;j++ ) 
			{
				intsco[i][j]= Integer.parseInt(tk.nextToken()); // 각 토큰을 int화 시켜서 배열에 대입
				// System.out.print(intsco[i][j]+"/"); // 시험출력
			}
			for(int j=0 ;j<n[i] ;j++ ) 
			{
				sum[i]+=intsco[i][j]; // 테스트케이스별 점수 총합을 sum[i]에 대입
			}
			avr[i]=sum[i]/n[i]; // sum[i]와 n[i]를 이용해 평균점수를 구하여 avr[i]에 대입
			for(int j=0;j<n[i] ;j++ ) 
			{
				if(intsco[i][j]>avr[i]) 
				{ // 각 점수변수가 담긴 intsco[i][j]와 평균점수인 avr[i]를 비교하여 intsco[i][j]가 더 크면 avrovr[i]에 1씩 카운팅
					avrovr[i]++;
				}
			}
			avovper[i]=(double)(avrovr[i])/(double)(n[i])*100.0; // avrovr[i]와 n[i]는 int이기때문에 먼저 나누기를 실행하고 double로 바꾸면 0.0으로 출력되기때문에 먼저 double화시키고 나눠준다.
// System.out.print(sum[i]+"/");
// System.out.print(avr[i]+"/");
// System.out.print(avrovr[i]+"/");
// System.out.print(String.format("%.3f",avovper[i])); // 시험출력
		}
		for(int i=0 ;i<tc ;i++ ) 
		{
			System.out.println(String.format("%.3f",avovper[i])+"%");
// String.format("%.nf",double)=>double을 출력 시 소숫점 n번째자리까지 출력(문자열로 바꾸어 출력한다)(소수점 n+1번째자리에서 반올림)
		}


	}

}