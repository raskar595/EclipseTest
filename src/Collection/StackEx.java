package Collection;

import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<Integer> list=new Stack<Integer>();
		
		list.push(34);
		list.push(2);
		list.add(9);
		list.add(null);
		list.add(9);
		
		System.out.println(list);
		System.out.println(list.pop());
		System.out.println(list.peek());
		
		System.out.println(list);

	}

}
