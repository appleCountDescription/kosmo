package f_exception;

import java.io.FileInputStream;

public class Ex03_Throws 
{
	public static void main(String[] args) {
		try {
			readFile();		//예외가 여기 떨어짐 => 나도 던질까 잡을까? => 잡으려면 try catch
		} catch(Exception e) {
			System.out.println("실패");
		}
	}
	
	static void readFile() throws Exception{	//예외 회피 = 예외 던짐
		FileInputStream fis = new FileInputStream("abc.txt");	//너 잡을래 던질래?
	}
}
