package BasicProgramming;

import java.util.Scanner;

public class LexographicallySmallString {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	    int nos = Integer.parseInt(s.nextLine());
	    int[] k = new int[nos];
	    String[] inputString = new String[nos];
	    for(int i=0; i<nos; i++){
	        String[] data = s.nextLine().trim().split(" ");
	        k[i] = Integer.parseInt(data[0]);
	        inputString[i] = data[1];
	    }
	    for(int i=0; i<nos; i++){
	        if(k[i]==1){
	            while(inputString[i].charAt(0) > inputString[i].charAt(1)){
	                char replace = inputString[i].charAt(0);
	                StringBuilder sb = new StringBuilder(inputString[i]);
	                sb.deleteCharAt(0);
	                sb.append(replace);
	                //System.out.println(sb.toString());
	                inputString[i] = sb.toString();
	            }
	        }else{
	        	while((inputString[i].charAt(biggestCharacterIdx(inputString[i].substring(0, k[i]))) > inputString[i].charAt(k[i]))
	            		|| smallestCharacterIdx(inputString[i].substring(0, k[i])) != 0) {
	            	char replace = inputString[i].charAt(biggestCharacterIdx(inputString[i].substring(0, k[i])));
	                StringBuilder sb = new StringBuilder(inputString[i]);
	                sb.deleteCharAt(biggestCharacterIdx(inputString[i].substring(0, k[i])));
	                sb.append(replace);
	                //System.out.println(sb.toString());
	                inputString[i] = sb.toString();
	            }
	        }
	    }
	    s.close();
	    for(int i=0; i<nos; i++) {
	    	System.out.println(inputString[i]);
	    }
	}
	public static int biggestCharacterIdx(String s) {
		int index = 0;
		for(int i=0; i<s.length()-1; i++) {
			if(s.charAt(i)<s.charAt(i+1)) {
				index = i+1;
			}
		}
		return index;
	}
	public static int smallestCharacterIdx(String s) {
		int index = 0;
		for(int i=0; i<s.length()-1; i++) {
			if(s.charAt(i)<s.charAt(i+1)) {
				index = i;
			}
		}
		return index;
	}
}
