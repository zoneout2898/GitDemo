package Practice;

import java.util.HashMap;
import java.util.Map;

public class NoOfOcc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Nagggendejhkjgheeeer";
		/*char a='e';
		int l=s.length();
		int count=0;
		for(int i=0;i<l;i++)
		{
			if(s.charAt(i)==a)
			{
				count++;
			}
		}
		System.out.println(count);*/
		Map<Object, Object> m=new HashMap<>();
		int l=s.length();
		for(int i=0;i<l;i++)
		{
			if(!m.containsKey(s.charAt(i)))
			{
				m.put(s.charAt(i), 1);
			}
			else
			{
				//int v=(int) m.get(s.charAt(i));
				//System.out.println(m.get(s.charAt(i)));
				//System.out.println(m.get(s.charAt(i)).getClass().getName());
				m.put(s.charAt(i), (int)m.get(s.charAt(i))+1);
			}
		}
		System.out.println(m);

	}

}
