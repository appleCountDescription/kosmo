package d_collection;

import java.util.ArrayList;
import java.util.Iterator;

public class aArrayList2 {
	
	public static void main(String[] args) {
		
		
		ArrayList<Student> list = dataset();
		
		// 전체요소를 순서대로 검색할 때 (속도가 빠름)
		// Enumeration -> Iterator		//
		Iterator<Student> it = list.iterator();
		while(it.hasNext()) {
			Student s = it.next();
			System.out.println(s);
		}
		
//		//출력
//		for(int i=0; i<list.size(); i++) {
//			Student temp = (Student)list.get(i);
//			System.out.println(temp);
//		}
//		//향상된 for문 출력 ***************************	//Generics 꼭 해야 함
//		for(Student temp:list) {	//ㅇ뒤가 집합
//			System.out.println(temp);
//		}
//			
		
	}
	static ArrayList dataset() {
		ArrayList<Student> list = new ArrayList<Student>();	
		list.add(new Student("홍길자", 55));
		list.add(new Student("홍길동", 44));
		list.add(new Student("박길자", 22));
		return list;
	}	
}

class Student {
	String name;
	int age;
	Student(String name, int age){
		this.name = name;
		this.age = age;
	}
	public String toString() {				//오버라이딩
		return name + "님 [" + age + "]"; 
	}
}