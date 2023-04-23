package e_method;

public class Ex03_연습1 
{
	public static void main(String[] args) 
	{
		char ko = 'A', en = 'C', math = 'B';
		output(ko, en, math);
	}
	
	static void output(char ko, char en, char math)
	{
		//국영수 점수 출력
		System.out.println("국어: " + ko + " 영어: " + en + " 수학: " + math);
	}

}
