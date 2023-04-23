package c_control;

import java.util.Scanner;

public class Ex17_별찍기 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		int m = input.nextInt();
		
		for(int i=0; i<n ; i++)
		{	
			if (m==1)
			{
				for(int j=0; j<=i; j++)
				{
					System.out.print('*');
				}
				System.out.println("");
			}
			else if (m==2)
			{
				for(int k=0; k<n-i; k++)
				{
					System.out.print('*');
				}
				System.out.println("");
			}
			else if (m==3)
			{
				for(int l=0; l<n-i-1; l++)
				{
					System.out.print(" ");
				}
				for(int a=0; a<(i+1)*2-1; a++)
				{
					System.out.print("*");
				}
				System.out.println("");
			}
			else
			{
			System.out.println("INPUT ERROR!"); break;
			}
		}
	}
}
