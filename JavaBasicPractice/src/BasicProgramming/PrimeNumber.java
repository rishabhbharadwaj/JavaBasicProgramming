package BasicProgramming;

import java.util.Scanner;

public class PrimeNumber {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println("Enter the number to check :");
		boolean flag = true;
		int number = new Scanner(System.in).nextInt();
		for (int i=2;i<=number/2;i++) {
			if(number%i==0) {
				System.out.println("Is is not a prime");
				flag = false;
				break;
			}
		}
		if(!flag) {
			System.out.println("Not Prime");
		}else {
			System.out.println("Prime!!!");
		}
	}
}
