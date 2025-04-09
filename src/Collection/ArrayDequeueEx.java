package Collection;

import java.util.ArrayDeque;

public class ArrayDequeueEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayDeque<Integer> list=new ArrayDeque<Integer>();
		
		list.add(3);
		list.add(65);
		list.addFirst(23);
		list.offerLast(3);
		list.addFirst(11);
		list.offer(9);
//		list.add(null);
		
		System.out.println(list);

	}

}
