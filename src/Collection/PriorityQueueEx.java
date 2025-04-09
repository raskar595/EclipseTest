package Collection;

import java.util.PriorityQueue;

public class PriorityQueueEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PriorityQueue<Integer> list=new PriorityQueue<Integer>();
		
		list.add(23);
		list.add(2);
//		list.offer(0);
		list.add(7);
		list.add(7);
//		list.add(null);
		
		System.out.println(list);

	}

}
