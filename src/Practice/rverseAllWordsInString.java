package Practice;

import java.util.Arrays;

public class rverseAllWordsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Welocme to the world";
		String s1[]=s.split(" ");
		System.out.println(Arrays.toString(s1));
		String revS="";
		for(String x:s1)
		{
			String revword="";
			for(int i=x.length()-1;i>=0;i--)
			{
				revword=revword+x.charAt(i);
			}
			//System.out.println(revword);
			revS=revS+revword+" ";
		}
		System.out.println(revS);

	}

}
