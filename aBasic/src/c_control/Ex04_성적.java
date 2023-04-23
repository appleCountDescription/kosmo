package c_control;

public class Ex04_성적 {
	
	public static void main(String[] args) {
		
		int kor = 90, eng = 88, math = 77;
		// double형 avg 변수에 평균을 지정하고 출력
		
		double avg = (double)((kor + eng + math)/3);
		
		System.out.println("평균: " + avg);
		
		// 평균에 의해 학점을 출력
		
		char score = '\u0000';	// unicode 0	//
		
		if (avg >= 90)
			score = 'A';		// 한 줄짜리 코드에는 블럭 안 써도 됨
		else if (avg >= 80)
			score = 'B';
		else if (avg >= 70)
			score = 'C';
		else 
			score = 'F';
		System.out.println();
		
		// 평균에 의해 학점을 출력(switch문 입력)
		
		switch ((int)avg/10)
		{
			case 10:
			case 9: score = 'A'; break;
			case 8: score = 'B'; break;
			case 7: score = 'C'; break;
			default: score = 'F';
		}
		System.out.println(score + "학점");
		
	}

}
