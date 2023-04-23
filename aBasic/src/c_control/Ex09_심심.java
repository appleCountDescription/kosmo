package c_control;

import java.util.Scanner;

public class Ex09_심심 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < n - i -1; j++)
			{	
				System.out.print("  ");
			}
			for(int k = 1; k < i + 2; k++)
			{
				System.out.print(k + " ");
			}
			System.out.println("");
		}
	}

}