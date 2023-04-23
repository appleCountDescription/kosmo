package d_collection;

import java.util.*;

/*
 * 	스택(stack): LIFO
 * 			Last In First Out
 * 			뒤로가기 버튼
 * 			
 * 
 * 	큐(queue): FIFO
 * 			First In First Out
 */

public class zStackQueue {
	
	public static void main(String[] args) {
		
		Stack stack = new Stack();
		stack.push("A");
		stack.push("B");
		stack.push("C");
		while( !stack.empty()) {
			System.out.println(stack.pop());
		}
		
		Queue queue = new LinkedList();
		queue.offer("가");
		queue.offer("나");
		queue.offer("다");
		while(!queue.isEmpty()) {
			System.out.println(queue.poll());
		}
	}
	

}
