package Prgpractice;

public class Strongnumber {
	static int fact(int rem) {
		 int fact=1;
		 for(int i=rem;i>=1;i--) {
			 fact=fact*i;
		 }
		 return fact;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no=145;
		int sum=0;
		int copy=no;
		while(no!=0) {
			int rem=no%10;
			sum=sum+fact(rem);
			no=no/10;
		}
		if(copy==sum) {
			System.out.println(copy+"strongnumber");
			}
		else 
		{
			System.out.println(copy+"not a strong number");
	
		}
	}
}