package BasicProgramming;

import java.util.Scanner;

public class FibonacciSeries {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		/*
		 * Fibonacci number is sum of previous two Fibonacci numbers fn= fn-1+ fn-2
		 * first 11 Fibonacci numbers are 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55
		 */
		System.out.println("Enter number upto which fibonacci series to print:");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		System.out.println("Febonacci series upto "+number +" numbers :");
		System.out.println(febo(number));
	}
	
	public static int febo(int n) {
		int t1 = 0, t2 = 1;
		for(int i=1;i<=n;i++) {
			System.out.print(t1+" ");
			int sum = t1 + t2;
			t1 = t2;
			t2 = sum;
		}
		System.out.println();
		return t2-t1;
	}
}