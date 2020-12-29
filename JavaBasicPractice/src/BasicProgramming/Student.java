package BasicProgramming;

import java.util.Scanner;

public class Student {

	public static void main (String[] args) throws java.lang.Exception
	{
		
		Scanner s = new Scanner(System.in);
		String inputString = s.nextLine();
		int number = Integer.parseInt(inputString);
      	boolean flag = true;
      	int result = 0;
      	while(flag){
        	int reverse = 0;
        	int temp = number;
      		while(number!=0){
          		int digit = number%10;
          		reverse = reverse*10 + digit;
          		number = number/10;
        	}
      		int value = reverse + temp;
          	if(isPalindrome(String.valueOf(value))){
              result = value;
              flag = false;
            }else{
              number = value;
              flag = true;
            }
        }
      	System.out.println(result);
      	s.close();
	}
  	public static boolean isPalindrome(String inputString){
      StringBuilder input1 = new StringBuilder();
      input1.append(inputString);
      input1 = input1.reverse();
      if(inputString.equals(input1.toString())){
        return true;
      }
      return false;
    }	
}
