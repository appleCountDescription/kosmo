package b_operator;

/*
 * 	비교연산자
 * 	  ==	!=
 * 	  <  <=  >  >=
 */
public class Ex05_Comparable {
	
	public static void main(String[] args) {
		
		int kor = 88, eng = 79, math = 77;     // 정수형 변수 kor를 선언하고 이 변수에 값 88을 대입, 정수형 변수 eng를 선언하고 이 변수에 값 79를 대입, 정수형 변수 math를 선언하고 이 변수에 값 77을 대입
		double avg = (double)(kor+eng+math)/3; // 실수형 변수 avg를 선언하고 이 변수에 값 (kor+eng+math)/3을 대입하되, 정수로 나오지 않도록 double로 형변환하기
		System.out.println("평균: " + avg);     // 출력하고 한 줄 띄기: avg 값 출력하기
		
		// 학점 구하기 - 만약 평균이 90이상이라면
		if (avg >= 90) {						// if문: avg가 90 이상일 때
			System.out.println("A학점");			// 출력하고 한 줄 띄기: 글자 출력
		}else if (avg >= 80) {					// if문: avg가 80 이상일 때
			System.out.println("B학점");			// 출력하고 한 줄 띄기: 글자 출력
		}else if (avg >= 70) {					// if문: avg가 90 이상일 때
			System.out.println("C학점");			// 출력하고 한 줄 띄기: 글자 출력
		} // 흐름 - if => else if => else if => ...
		
		
		
	}

}
