package Collection;

import java.util.Enumeration;
import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector<Integer> vc=new Vector<Integer>();
		
		vc.add(23);
		vc.add(23);
		vc.add(22);
		vc.add(5);
		vc.add(null);
		
		Enumeration<Integer> enm=vc.elements();
		
		while(enm.hasMoreElements()) {
			System.out.println(enm.nextElement());
		}
			
		

	}

}
