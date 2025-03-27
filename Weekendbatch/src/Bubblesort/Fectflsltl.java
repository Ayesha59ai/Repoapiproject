package Bubblesort;

public class Fectflsltl {

	public static void main(String[] args) {
		int []arr= {21,15,5,10,100};
		int FL=0;
		int SL=0;
		int TL=0;
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]>FL) {
				TL=SL;
				SL=FL;
				FL=arr[i];
			}
			else if(arr[i]>SL)
			{
				TL=SL;
				SL=arr[i];
			}
			else if(arr[i]>TL) {
				TL=arr[i];
			}
		}
		System.out.println(FL);
		System.out.println(SL);
		System.out.println(TL);
	}

}
