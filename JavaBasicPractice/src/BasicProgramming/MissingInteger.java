package BasicProgramming;

import java.util.Arrays;

public class MissingInteger {
	
	public static void main(String[] args) {
		System.out.println(solution(new int[] {1, 2,3,1,6,4}));
	}
	
	public static int solution(int[] A) {
		int result = 0;
		Arrays.sort(A);
		boolean is1Present = false;
		for(int i=0; i<A.length; i++) {
			if(A[i] == 1) {
				is1Present = true;
			}
		}
		if(is1Present) {
			for(int i=0; i<A.length-1; i++) {
				int difference = Math.abs(A[i+1] - A[i]);
				if(difference > 1 && A[i] > 0) {
					result = A[i]+1;
					break;
				}
			}
		}else {
			result = 1;
		}
		if(result == 0){
		    result = A[A.length-1]+1;
		}
		return result;
	} 

}