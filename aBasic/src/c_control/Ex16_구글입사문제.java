package c_control;

public class Ex16_구글입사문제
{
	public static void main(String[] args) 
	{
		
		int countEights = 0;
		
		for (int i = 1; i <= 10000; i++)
		{
			int num = i;
			
			while(num != 0)
			{
				int a = num%10;
				if(a==8)
				{
					countEights++;
				}
				num /= 10;
			}
		}
		System.out.println(countEights);
	}
}