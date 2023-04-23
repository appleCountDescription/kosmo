package f_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex02_TryCatch2 
{
	public static void main(String[] args) 
	{
		FileInputStream fis = null;	//null = 초기화값
		try
		{
			fis = new FileInputStream("abc.txt");	//cannot be resolved = 컴퓨터가 뭔지 모르겠다고 말하는 것
			new FileInputStream("abc.txt");			//ctrl + shift + o 누르면 위에 import 뜸
			System.out.println("파일 연결");
			fis.read();
		}catch(FileNotFoundException ex){
			System.out.println("읽은 파일 없는 오류");
		}catch(IOException ex){
			System.out.println("읽고 쓰기 실패");
		}catch(Exception ex) {
			System.out.println("그 외 예외");
		}finally {
			try {fis.close();} catch (IOException e) {}
		}
		System.out.println("정상 종료");
	}
}
