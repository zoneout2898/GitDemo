package Practice;

public class rowColoumn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a[][]= {{3,4,5},{3,25,10},{5,2,9}};
//		int min=a[0][0];
//		int max=a[0][0];
//		int c=0;
//		
//		for(int i=0;i<3;i++)
//		{
//			for(int j=0;j<3;j++)
//			{
//				if(a[i][j]<min)
//				{
//					min=a[i][j];
//					c=j;
//				}
//			}
//		}
//		for(int i=0;i<3;i++)
//		{
//			if(a[i][c]>max)
//			{
//				max=a[i][c];
//			}
//		}
//		System.out.println(min+","+c);
//		System.out.println(max);
		String s="nagender";
		String s2=s;
		s.concat("Reddy");
		s=s+"r";
		System.out.println(s);
		StringBuffer s1=new StringBuffer("Nagender");
		s1.append("Reddy");
		System.out.println(s1);
		System.out.println(s2);
		
		

	}

}
