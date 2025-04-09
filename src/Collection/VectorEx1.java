package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class VectorEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> list=new ArrayList<Integer>();
		
		list.add(12);
		list.add(2);
		list.add(null);
	
		
		list.add(545);
		list.add(2);
		
//		System.out.println(list);
		
		Iterator<Integer> itr=list.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
