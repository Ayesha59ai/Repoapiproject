package Prgpractice;

public class Countdigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no=123566;
		int count=0;
		while(no!=0) {
			int rem=no%10;
			count++;
			no=no/10;
		}
		System.out.println(count);

	}

}
