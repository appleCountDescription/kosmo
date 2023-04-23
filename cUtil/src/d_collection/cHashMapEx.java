package d_collection;

import java.util.*;

public class cHashMapEx {
	
	public static void main(String[] args) {
		
		HashMap map = new HashMap();
			// key: id,  value: password
		map.put("javassem", "1234");	// 
		map.put("kimjava", "9999");
		map.put("kimbabo", "0000");
		map.put("kimjava", "1234");
		
		Scanner input = new Scanner(System.in);
		boolean isStop = false;
		while(!isStop) {
			System.out.println("아이디->");
			String id = input.nextLine();
			System.out.println("비밀번호->");
			String pw = input.nextLine();
			// 1-1 입력한 아이디가 map에 key값으로 존재하는지 알고 싶다
			if( map.containsKey(id) ) {
				// 2-1 아이디(key)에 value 값과 입력한 비밀번호가 같다면
				if( (map.get(id)).equals(pw) ) {
					System.out.println("로그인 성공");
					isStop = true;		//break보다 세련된 방법
				}else {
					System.out.println("비밀번호가 일치하지 않습니다");
					continue;
				}
				
			}else {	//1-2 해당하는 아이디가 없는 경우
				System.out.println("존재하지 않는 아이디입니다.");
				continue;
			}
			
		}
	}

}
