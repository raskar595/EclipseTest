package Operators;

import java.util.ArrayList;

public class ListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<Integer> list=new ArrayList<Integer>();
		
		list.add(23);
		list.add(53);
		list.add(2);
		list.add(null);
		list.add(2);
		
		System.out.println(list);
		
		list.clear();
		System.out.println(list);
		
	}

}
