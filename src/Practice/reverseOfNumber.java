package Practice;

import java.util.Scanner;

public class reverseOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner s= new Scanner(System.in);
		num=s.nextInt();
		
		int r=0;
		while(num!=0)
		{
			r=10*r+ num%10;
			num=num/10;
		}
		System.out.println(r);

	}

}
