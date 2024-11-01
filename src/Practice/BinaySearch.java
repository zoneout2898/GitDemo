package Practice;

public class BinaySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5,6,8,9,10,19};
		int h=a.length-1;
		int l=0;
		
		int se=5;
		while(l<=h)
		{
			int m=(l+h)/2;
			if(a[m]==se)
			{
				System.out.println("element found at"+m);
				break;
			}
			if(a[m]<se)
			{
				l=m+1;
			}
			if(a[m]>se)
			{
				h=m-1;
			}
			System.out.println("test");
		}
		

	}

}
