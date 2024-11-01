package Practice;

public class evenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=379924683;
		 if(i%2==0)
		 {
			 System.out.println("even");
		 }
		 else
		 {
			 System.out.println("odd");
		 }
		 evenOrOdd e=new evenOrOdd();
		 e.CountOfEvenAndOdd(i);
		 

	}
	public void CountOfEvenAndOdd(int num)
	{
		int eventCount=0;
		int oddcount=0;
		int r;
		while(num!=0)
		{
			r=num%10;
			num=num/10;
			if(r%2==0)
			{
				eventCount++;
			}
			else
			{
				oddcount++;
			}
		}
		System.out.println(eventCount+","+oddcount);
		
	}

}
