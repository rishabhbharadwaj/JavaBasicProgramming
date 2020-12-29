package BasicProgramming;

import java.util.Arrays;

public class ParamMissing {

	public static void main(String[] args) {
		System.out.println(sol(new int[] {1,2,3,4,5,7}));
	}
	
	public static int sol(int[] A) {
		int result = 0;
		if(A.length>0) {
			Arrays.sort(A);
			for(int i=0; i<A.length; i++) {
				if(A[i] != i+1) {
					result = i+1;
					break;
				}
			}
		}else {
			result = 1;
		}
		return result;
	}
}
