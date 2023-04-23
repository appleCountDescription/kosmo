package d_collection;
import java.util.*;		// 스캐너 등등
public class aArrayListEx {
	
	public static void main(String[] args) {
		// <generics> 
		ArrayList<String> list = new ArrayList<String>(4); // 스트링만 받겠다!
		list.add("rabbit");
		list.add("dog");
		list.add("zebra");
		list.add("fox");
		list.add("lion");
		list.add("tiger");
		list.add("ant");
		
		//=--------------------
		//동적인 배열
		System.out.println(list);
		list.set(3, "elephant");	//fox가 elephant로 바뀜
		System.out.println(list);
		list.remove(2);
		System.out.println(list.get(2));	// elephant가 3번째에서 2번째로 바뀜
		list.set(0, "ant");
		System.out.println(list);
		
		Collections.sort(list);	//알파벳 순으로
		System.out.println(list);
		
		System.out.println("------------------------");
		// 향상된 for문
		for(String temp : list) {		// :, of, in 등을 씀 / String a: 변수, list: 	/ :(콜론)은 자료구조에서만 씀
			System.out.println(temp);
		}
		
		//System.out.println(list);		// list.add가 메모리 알아서 넓혀 놓음, list라고 쓰는 이유: 배열 개수가 애매할 때 이게 편함. 다만 list는 속도가 매우 느림. 편하긴 함.
		for(int i=0; i<list.size(); i++) {
			String temp = (String)list.get(i);	//get 쓴 다음에는 형변환 해야 함
			System.out.println(temp);
		}
		
	}

}

/*	참고
//	cf) 자료구조 / 알고리즘
//
//	* 기본적인 자료구조에 클래스 => 콜랙션
//
//	1. List 
//		' 동적인 배열
//		' 인덱스를 가지고 있음
//		' ex) ArrayList
//
//	2. Set
//		' 인덱스가 없음
//		' 순서 보장 안 함
//		' 동일한 데이타 중복 안 됨
//		' ex) HashSet, TreeSet 등등
//
//	3. HashMap
//		' 키와 값 구조
 * 		' 키는 중복 안 됨
 * 		' 키를 통해 값(value) 찾는 구조
 * 		' 
 * 		
*/
