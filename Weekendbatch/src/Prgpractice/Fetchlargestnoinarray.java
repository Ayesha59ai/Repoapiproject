package Prgpractice;

public class Fetchlargestnoinarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arry= {7,5,9,10};
		int largest=arry[0];
		for(int i=0;i<arry.length;i++) {
			 if(arry[i]>largest) {
				 largest=arry[i];
			 }
		}
		System.out.println(largest);

	}

}
