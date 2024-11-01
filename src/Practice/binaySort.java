package Practice;

import java.util.Arrays;

public class binaySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {20,16,19,2,6,-1,-10,43,82,99};
		int b[];
		int l=a.length;
		int temp;
		for(int i=0;i<l;i++)
		{
			for(int j=0;j<l-1;j++)
			{
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
			System.out.println(Arrays.toString(a));
		}
		for(int i=0;i<l;i++)
		{
			System.out.println(a[i]);
		}

	}

}
