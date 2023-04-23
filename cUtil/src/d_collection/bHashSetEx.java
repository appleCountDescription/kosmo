package d_collection;

import java.util.*;

public class bHashSetEx {
	
	public static void main(String[] args) {	
		HashSet set = new HashSet();	//중복수 배제
		set.add("tiger");
		set.add("ant");
		set.add("dog");
		set.add("dog");
		set.add("tiger");
		set.add("lion");
		
		System.out.println(set);
	}

}
