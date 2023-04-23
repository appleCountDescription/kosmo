package b_operator;
import java.util.Scanner;
public class Ex14_선택 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("정수 3개를 입력하시오.");
		int num = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();
		
		if((num >= num2 & num <= num3) | (num <= num2 & num >= num3))
		{
			System.out.println(num + "이(가) 두 번째로 큰 수입니다.");
		}
		else if ((num2 >= num & num2 <= num3) | (num2 <= num & num2 >= num3))
		{
			System.out.println(num2 + "이(가) 두 번째로 큰 수입니다.");
		}
		else
		{
			System.out.println(num3 + "이(가) 두 번째로 큰 수입니다.");
		}
	}
}