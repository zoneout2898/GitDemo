package Practice;

public class numberOdDigitsInANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=56387973;
		int n = 0;
		while(i>0)
		{
			i=i/10;
			n++;
		}
		System.out.println(n);

	}

}
