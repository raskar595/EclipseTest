package Collection;

import java.util.Hashtable;
import java.util.Map;

public class HashTableEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hashtable<Integer, String> list=new Hashtable<Integer, String>();
		
		list.put(101,"Rohan");
		list.put(105, "Suarj");
		list.put(111, "Ajay");
		list.put(100, "Nikhil");
		
//		System.out.println(list);
		
		for(Map.Entry<Integer, String> ent:list.entrySet()) {
			System.out.println(ent.getKey()+" -> "+ent.getValue());
		}
	}

}
