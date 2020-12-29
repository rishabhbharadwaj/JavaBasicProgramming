package BasicProgramming;

import java.util.Scanner;

public class ArrayEquilibrium {
	
	public static void main (String[] args) throws java.lang.Exception
    {
        
        Scanner s = new Scanner(System.in);
        String[] input = s.nextLine().replace(" ", "").split(",");
        int result = -1;
        if(input.length>0) {
        	if(sum(input,1,input.length) == 0){
                result = 0;
            }
            for(int i=1; i<input.length-1; i++){
                if(sum(input, 0, i) == sum(input, i+1, input.length)){
                    result = i;
                    break;
                }
            }
            if(sum(input,0,input.length-1) == 0){
                result = input.length-1;
            }
        }
        System.out.println(result);
        s.close();
    }
    
    public static int sum(String[] array, int start, int end){
        int sum = 0;
        for(int i=start; i<end; i++){
            sum = sum + Integer.parseInt(array[i]);
        }
        return sum;
    }
}
