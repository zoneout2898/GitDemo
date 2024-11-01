package Practice;

public class primeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		primeOrNot p=new primeOrNot();
		p.prime(13);

	}
	public void prime(int n)
	{
		int count=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println("prime");
		}
		else
		{
			System.out.println("not prime");
		}
	}

}
