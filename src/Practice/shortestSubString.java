package Practice;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class shortestSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "aadddzzz"
				+ "";
		shortestSubString ss=new shortestSubString();
		System.out.println(ss.listOfSubstrings(s));
		System.out.println(ss.uniqueSubStrings(ss.listOfSubstrings(s)));
		System.out.println(ss.shortSubString(ss.uniqueSubStrings(ss.listOfSubstrings(s)),s.length()));

	}
	public List<String> listOfSubstrings(String s)
	{
		List<String> lis=new LinkedList<String>();
		int l=s.length();
		for(int i=0;i<=l;i++)
		{
			for(int j=i+1;j<=l;j++)
			{
				lis.add(s.substring(i, j));
			}
		}
		return lis;
		
	}
	public Map<String, Integer> uniqueSubStrings(List<String> lis)
	{
		Map<String, Integer> mp=new HashMap<>();
		for(String x:lis)
		{
			if(mp.containsKey(x))
			{
				mp.put(x, (int)mp.get(x)+1);
			}
			else
			{
				mp.put(x, 1);
			}
		}
		//System.out.println(mp);
		Map<String, Integer> mp1=new HashMap<>();
		for(String x:mp.keySet())
		{
			if(mp.get(x)==1)
			{
				mp1.put(x, x.length());
			}
		}
		return mp1;
	}
	public List<String> shortSubString(Map<String, Integer> m,int len)
	{
		Collection<Integer> l= m.values();
		int shortLen=len;
		for(int x:l)
		{
			if(x<shortLen)
			{
				shortLen=x;
			}
		}
		List<String> fl=new LinkedList<>();
		for(String x:m.keySet())
		{
			if(m.get(x)==shortLen)
			{
				fl.add(x);
			}
		}
		return fl;
		
	}

}

