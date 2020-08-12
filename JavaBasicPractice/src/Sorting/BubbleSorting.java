package Sorting;

public class BubbleSorting {
	public static void main(String[] args) {
		int[] arr = {18,15,10,5,2,1};
		boolean swapped;
		for(int i=0; i< arr.length-1; i++) {
			swapped = false; 
			for(int j=0; j< arr.length-1-i; j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
					swapped = true;
				}
			}
			if(swapped == false) {
				break;
			}
			printArray(arr);
		}
	}
	public static void printArray(int[] arr) {
		for(int i=0; i< arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}