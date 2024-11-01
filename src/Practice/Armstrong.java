package Practice;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=153;
		int a=n;
		int sum=0;
		int r;
		while(n>0)
		{
			r=n%10;
			sum=sum+(r*r*r);
			n=n/10;
		}
		if(sum==a)
		{
			System.out.println("arm");
		}
		else
		{
			System.out.println("Not arm");
		}

	}

}
