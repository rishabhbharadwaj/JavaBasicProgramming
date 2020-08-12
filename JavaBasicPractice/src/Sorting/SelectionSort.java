package Sorting;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = {18,15,10,5,2,1};
		for(int i=0; i< arr.length-1; i++) {
			int minIndex = i;
			for(int j=i+1; j<arr.length;j++) {
				if(arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			// shifting instead of swapping
			int key = arr[minIndex];
			while(minIndex > i) {
				arr[minIndex] = arr[minIndex-1];
				minIndex--;
			}
			arr[i] = key;
		}
		printArray(arr);
	}
	public static void printArray(int[] arr) {
		for(int i=0; i< arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}