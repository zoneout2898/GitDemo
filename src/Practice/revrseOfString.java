package Practice;

public class revrseOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Nagender";
		int l=s.length();
		String r="";
		for(int i=l-1;i>=0;i--)
		{
			r=r+s.charAt(i);
		}
		System.out.println(r);

	}
	

}
