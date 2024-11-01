package Practice;

public class Testone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 16 =79
		//7+9=16 
		Testone t=new Testone();
		System.out.println(t.solution(73, 100000000));
		

	}
	public int sumOfDigits(int num)
	{
		int s=0;
		while(num>0)
		{
			int r=num%10;
			s=s+r;
			num=num/10;
		}
		return s;
	}
	
	public int solution(int k,int n)
	{
		int i;
		for(i=0;i<n;i++)
		{
			if(sumOfDigits(i)==k)
			{
				break;
			}
		}
		return i;
		
	}

}
