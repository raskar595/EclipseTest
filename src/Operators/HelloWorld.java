package Operators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list=new ArrayList<Integer>();
		
		list.add(23);
		list.add(43);
		list.add(3);
		
//		Iterator<Integer> itr=list.iterator();
		ListIterator<Integer> litr=list.listIterator();
		
		while(litr.hasNext()) {
			litr.next();
		}
		
		while(litr.hasPrevious()) {
			System.out.println(litr.previous());
		}
	}

}
