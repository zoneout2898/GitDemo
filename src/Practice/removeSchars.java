package Practice;

public class removeSchars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Nag%en*de@r";
		String s1;
		s1=s.replaceAll("[^a-z 1-9 A-z]", "");
		System.out.println(s1);

	}

}
