package BasicProgramming;

public class ArrayRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array = {1,2,3,4,5,6};
		rotation(array, 6, 2);
		print(array);
	}

	public static void rotation(int arr[], int size, int times ) {
		for(int i=0; i<times; i++) {
			int first = arr[0];
			for(int j=0; j<size-1; j++) {
				arr[j] = arr[j+1];
			}
			arr[size-1] = first;
		}
	}
	
	public static void print(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
}
