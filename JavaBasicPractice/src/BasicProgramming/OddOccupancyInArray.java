package BasicProgramming;

import java.util.Arrays;

public class OddOccupancyInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,2,1,3,5};
		solution(arr);
	}
	
	public static void solution(int[] arr) {
		int result = -1;
		Arrays.sort(arr);
		if(arr.length > 1) {
			for(int i=1; i<arr.length;i=i+2) {
				if(arr[i-1] != arr[i]) {
					result = arr[i-1];
				}
			}if(result == -1) {
				result = arr[arr.length-1];
			}
		}
		System.out.println(Math.abs(result));
	}
}
