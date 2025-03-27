package Bubblesort;

public class flsltl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  []arr= {10,50,70,100};
		int FL=0;
		int SL=0;
		int TL=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>FL) {
				FL=arr[i];
			}
			else if(arr[i]>SL) {
				SL=arr[i];
			}
			else if(arr[i]>SL) {
				TL=arr[i];
			}
			
		}
		System.out.println(FL);
		System.out.println(SL);
		System.out.println(TL);

	}

}
