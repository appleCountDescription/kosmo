package c_control;

public class Ex99_369엄청중요 
{
	public static void main(String[] args) 
	{
		// 1부터 50까지 숫자 중에서 3.6.9 게임처럼 3, 6, 9 숫자를 포함하면 그 갯수만큼 "짝" 글자를 출력하고, 그렇지 않으면 그 숫자를 출력한다.
		// tip: 1부터 50까지 ==> for문으로(숫자가 정해져 있으니)
		//      숫자의 자리수마다 8, 9, 13 ==> while()
		for (int i = 1; i <= 50; i++)
		{
			int su = i;
			boolean su369 = false;
			
			while(su != 0)
			{
				int na = su%10;
				if(na==3 | na==6 | na==9)
				{
					System.out.print("짝");
					su369 = true;
				}
				su /= 10;
			}
			if(su369) System.out.println();
			else System.out.println(i);
		}
	}
}