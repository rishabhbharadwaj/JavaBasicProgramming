package BasicProgramming;

public class MaxCounters {
	
	public static void solution(int[] A, int N) {
		int[] counter = new int[N];
		int max = 0;
		int level = 0;
		boolean previousmax = false;
		for(int i=0; i<A.length; i++) {
			if(A[i] >= 1 && A[i]<=N) {
				 counter[A[i]-1] += 1;
				 if(counter[A[i]-1] > max)
					 max = counter[A[i]-1];
				 previousmax = false;
			}else if(A[i] == N+1) {
				if(!previousmax) {
					level = level + max;
					max = 0;
					counter = new int[N];
					previousmax = true;
				}
			}
		}
		for(int i=0; i<N; i++){
		    counter[i] += level;
		}
	}
	
	public static void main(String[] args) {
		solution(new int[] {3,4,4,6,1,4,4}, 5);
	}

}
