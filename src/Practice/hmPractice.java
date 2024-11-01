package Practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class hmPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hm =new HashMap<Integer, String>();
		hm.put(1, "A");
		hm.put(2, "B");
		hm.put(3, "C");
		hm.put(4, "D");
		hm.put(5, "E");
		Set s=hm.entrySet();
		Iterator it =s.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
//			Map.Entry mp=(Entry) it.next();
//			System.out.println(mp.getKey()+","+mp.getValue());
		}

	}

}
