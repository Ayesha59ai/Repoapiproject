package Bubblesort;

public class Bubble {

	public static void main(String[] args) {
		 int[] arr = {7, 6, 5, 4, 2,1};
	        int n = arr.length;

	        // Bubble Sort algorithm
	        for (int i = 0; i < n - 1; i++) {
	            for (int j = 0; j < n - 1 ; j++) {
	                if (arr[j] > arr[j + 1]) {
	                    // Swap arr[j] and arr[j + 1]
	                    int temp = arr[j];
	                    arr[j] = arr[j + 1];
	                    arr[j + 1] = temp;
	                }
	            }
	        }

	        // Print sorted array
	        for (int k = 0; k < arr.length; k++) {
	            System.out.println(arr[k]);
	        }	}

}
