package Collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> list=new ArrayList<Integer>();
		
		list.add(3);
		list.add(4);
		list.add(14);
		list.add(22);
		
		ListIterator<Integer> litr=list.listIterator();
		
		while(litr.hasNext()) {
//			System.out.println(litr.next());
			litr.next();
		}
		
		System.out.println("Backwordly.....");
		
		while(litr.hasPrevious()) {
			System.out.println(litr.previous());
		}

	}

}
