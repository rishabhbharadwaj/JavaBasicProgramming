package BasicProgramming;

import java.util.Arrays;

public class GenomicRangeQuery {
	
	public static int[] solution(String S, int[] P, int[] Q) {
        // write your code in Java SE 8
        int stringLength = S.length();
        int[] decodedArray = new int[stringLength];
        for(int i=0; i<stringLength; i++){
            if(S.charAt(i) == 'A'){
                decodedArray[i] = 1;
            }else if(S.charAt(i) == 'C'){
                decodedArray[i] = 2;
            }else if(S.charAt(i) == 'G'){
                decodedArray[i] = 3;
            }else if(S.charAt(i) == 'T'){
                decodedArray[i] = 4;
            }
        }
        int queries = P.length;
        int[] result = new int[queries]; 
        for(int i=0; i<queries; i++){
            int[] subArray = Arrays.copyOfRange(decodedArray,P[i],Q[i]+1);
            Arrays.sort(subArray);
            result[i] = subArray[0];
        }
        for(int i=0; i<queries; i++) {
        	System.out.println(result[i]);
        }
        return result;
    }
	
	public static void main(String[] args) {
		solution("CAGCCTA", new int[] {2,5,0}, new int[] {4,5,6});
		String s = "abc";
		System.out.println(s.contains("s"));
	}

}
