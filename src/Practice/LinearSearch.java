package Practice;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {20,16,19,2,6,43,82,99};
		int se=82;
		int l=a.length;
		for(int i=0;i<l;i++)
		{
			if(se==a[i])
			{
				System.out.println("element found at"+i);
				break;
			}
		}

	}

}
