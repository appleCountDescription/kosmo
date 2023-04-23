package f_exception;

public class MyException extends Exception {
	
	public String getMessage() {
		return "서버에서 문제 발생";
	}
}
