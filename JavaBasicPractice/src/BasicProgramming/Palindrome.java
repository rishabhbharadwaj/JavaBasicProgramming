package BasicProgramming;

import java.util.Scanner;

public class Palindrome {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		/* A Palindrome is a String which is equal to the reverse of itself */

		System.out.print("Enter the string"); String word = new
				Scanner(System.in).next(); if(word.equals(new
						StringBuilder(word).reverse().toString())) {
					System.out.println("Palindrome"); } else { System.out.println("Chutiya"); }

	}

}
