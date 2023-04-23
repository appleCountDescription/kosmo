package d_collection;

import java.util.*;

public class bTreeSetEx {
	
	public static void main(String[] args) {
		
		TreeSet<String> set = new TreeSet<String>();	//중복수 배제
		set.add("dog");
		set.add("tiger");
		set.add("lion");
		set.add("ant");
		set.add("cat");
		set.add("shark");
		set.add("bee");
		
		System.out.println(set);
		System.out.println(set.subSet("c", "s"));	// c부터 s 앞의 것까지
	}
}
