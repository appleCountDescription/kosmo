package d_collection;

import java.util.*;

public class bLottoSet {
	
	public static void main(String[] args) {
		
		HashSet<Integer> lotto = new HashSet<Integer>();
		//for(int i=0; i<6; i++) {
		while(lotto.size()<6) {
		int num = (int)(Math.random()*45);
			lotto.add(num);
		}
		System.out.println(lotto);
		
		List<Integer> list = new ArrayList<Integer>(lotto);
		Collections.sort(list);
		System.out.println(list);
	}

}
