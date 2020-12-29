package BasicProgramming;

public class ArrayDifference {
	
	public static void main(String[] args) {
		System.out.println(solution(new int[] {-10,-20,-30,-40,100}));
	}
	public static int solution(int[] A) {
        // write your code in Java SE 8
        int result = 0;
        int start = 0;
        int end = A.length;
        int counter = 0;
        int difference = 0;
        boolean flag = true;
        for(int i=0; flag == true; i++){
            int mid = (start+end)/2;
            int leftSum = sum(A, 0, mid);
            int rightSum = sum(A, mid, A.length);
            if(rightSum > leftSum){
                start = mid; 
            }else if(leftSum > rightSum){
                end = mid+1;
            }else{
                return result;
            }
            difference = Math.abs(leftSum - rightSum);
            if(i == 0) {
            	counter = difference;
            }else {
            	if(difference < counter) {
            		counter = difference;
            		flag = true;
            	}
            	else {
            		result = counter;
            		flag = false;
            	}
            }
        }
        return result;
        
    }
    public static int sum(int[] A,int startIdx, int endIdx){
        int sum = 0;
        for(int i=startIdx; i<endIdx; i++){
            sum += A[i];
        }
        return sum;
    }

}
