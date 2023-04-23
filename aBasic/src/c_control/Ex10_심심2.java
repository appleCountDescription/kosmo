package c_control;

import java.util.Scanner;

public class Ex10_심심2 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		int a = 1;
		
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < i; j++)
			{
				System.out.print("  ");
			}
			for(int k = 0; k<=n-i-1; k++)
			{
				System.out.print(a++ + " ");
			}			
			System.out.println("");
		}
	}

}