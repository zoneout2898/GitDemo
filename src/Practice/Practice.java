package Practice;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=153487874;
		if(i%2==0)
		{
			System.out.println("even");
		}
		else
		{
			System.out.println("odd");
		}
		checkEvenOrOdd(i);

	}
	public static void checkEvenOrOdd(int num)
	{
		int r;
		int evencount = 0;
		int oddcount=0;
		while(num>0)
		{
			r=num%10;
			if(r%2==0)
			{
				evencount++;
			}
			else
			{
				oddcount++;
			}
			num=num/10;
		}
		System.out.println(evencount+"   "+ oddcount);
		
	}

}
