package b_operator;

public class Ex11_Samhang { // 삼항
	
	public static void main(String[] args) {
		
		// 80점 이상이면 '합격'이고 그렇지 않으면 '불합격'
		int score = 81;
		
//		String result;
//		if(score >= 80) {
//			result = "합격";
//		}else {
//			result = "불합격";
//		}
		
		//-------------------------------------------------
		
//		String result = (score >= 80)? "합격" : "불합격";
//		
//		
//		System.out.println("당신은 " + result + "입니다.");
		
		//-------------------------------------------------
		
		int a=4, b=3;
		int max = a>b? a:b ;
		System.out.println("두 수 중 큰 수:" + max);
		
	}

}
