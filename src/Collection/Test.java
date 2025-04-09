package Collection;

import java.util.Hashtable;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hashtable<Integer, String> list=new Hashtable<Integer, String>();
		
		list.put(101, "suarj");
		list.put(99, "Dhiraj");
		list.put(110, "Abhay");
		
		System.out.println(list);
		
		for(Map.Entry<Integer,String> e:list.entrySet()) {
			System.out.println(e.getKey()+" -> "+e.getValue());
		}

	}

}
