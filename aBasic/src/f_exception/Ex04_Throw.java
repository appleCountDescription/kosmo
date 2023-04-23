package f_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Ex04_Throw 
{
	public static void main(String[] args) {
		try {		//예외를 잡을 때
			readFile();
		} catch(Exception e) {
			System.out.println("예외: " + e.getMessage());
		  }
	}
	
	static void readFile() throws MyException{	//예외를 던질 때
		try {
			FileInputStream fis = new FileInputStream("abc.txt");	
		} catch (FileNotFoundException e) {
			throw new MyException();	//일부러 예외 발생
		  }	
	}
}