package e_method;

import java.util.Scanner;

public class Ex08_추가연습 
{
	public static void main(String[] args) 
	{
		int [][]cand = hooBo();	//argument(인자, 인수)
		int [][] pyo = votes(cand);
		
		
	}

	static int [][] hooBo()	//parameter(매개변수)
	{
		int [][] cand = null;
		int numVote = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("투표자 수를 입력하시오: ");
		int voter = sc.nextInt();
		System.out.print("후보 수를 입력하시오: ");
		int N = sc.nextInt();
		System.out.println("");
		System.out.printf("몇 번째 후보에 투표하시겠습니까? (현재 후보 수: %d)", N);
		for(int i=0; i<voter; i++)
		{
			int vote = sc.nextInt();
		}
		return cand;
	}
	
	static int [][] votes(int [][] cand)
	{
		Scanner sc = new Scanner(System.in);
		
		int n;
		switch(cand.length * 10)
		{
			
		}
		
		int vote = 0;
		int [][] pyo = null;
		// int [][] pyo = new int [cand][];
		for(int i=0; i<cand.length; i++)		//pyo[][]하고 pyo[] length 하면 될 듯?
		{
			pyo = new int[i][vote++];
		}
		return pyo;
	}

}
