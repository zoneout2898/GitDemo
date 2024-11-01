package Practice;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=0,n2=1;
		int sum=0;
		int n=1;
		System.out.print(n1+","+n2+",");
		while(n<=10)
		{
			sum=n1+n2;
			System.out.print(sum+",");
			n1=n2;
			n2=sum;
			n++;
			
		}

	}

}
