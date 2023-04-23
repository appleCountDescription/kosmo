package f_numbergame;

public class Main {

	public static void main(String[] args) {
		// 1. 화면 구성
		GameFrame game = new GameFrame();	// 메모리 올리기

		// 2. 랜덤 문자를 지정
		game.initChar();
		
		// 3. 버튼에 문자 보여주기
		game.showAnswer();
	}

}
