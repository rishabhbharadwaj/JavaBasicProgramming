package Sorting;

public class RecurringBubbleSorting {
	
	public static void main(String[] args) {
		int[] arr = {18,15,10,5,2,1};
		bubbleSort(arr, arr.length);
		printArray(arr);
	}
	public static void bubbleSort(int[] arr, int n) {
		if(n==1) {
			return;
		}
		for(int i=0; i<n-1;i++) {
			if(arr[i]>arr[i+1]) {
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
			}
		}
		bubbleSort(arr, n-1);
	}
	public static void printArray(int[] arr) {
		for(int i=0; i< arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}