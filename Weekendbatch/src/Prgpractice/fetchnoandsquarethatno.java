package Prgpractice;

public class fetchnoandsquarethatno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no=123;
		while(no!=0) {
			int rem=no%10;
			System.out.println(rem*rem);
			no=no/10;
		}

	}

}
