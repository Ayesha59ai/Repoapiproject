package Prgpractice;

public class Perfectnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int j=1;j<=100;j++) {
		int value=j;
		int sum=0;
		for(int i=1;i<=value/2;i++) {
			if(value%i==0) {
				sum=sum+i;
			}
		}
		
		if(sum==value) {
			System.out.println(value+"is a perfect no");
		}
		else {
			System.out.println(value+"is not a perfect no");
		}

	}
	}
}