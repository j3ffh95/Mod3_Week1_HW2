package HW2UserInputPack;

import java.util.Scanner;

public class HW2UserInput {

	public static void main(String[] args) {
//		1. Write Fibonnaci series between the user entered start and end values

//		Scanner scanner = new Scanner(System.in);
//
//		System.out.println("Enter length of the Fibonacci Series: ");
//
//		int number = scanner.nextInt();
//		if (number >= 1 && number <= 70) {
//			System.out.println("Your fibonacci series: ");
//			fibonacciFunc(number);
//		} else {
//			System.out.println("Invalid input. Enter a whole number between 1 and 40.");
//		}

//		==================================================================================================================

//		2. Determine whether a user entered number is an Armstrong number
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Please Enter a number more than 0 to check if it is an Armstrong number: ");
//
//		int number = scanner.nextInt();
//		if (number >= 0) {
//			if (checkArmstrongNumber(number)) {
//				System.out.printf("The number %d is an Armstrong number.", number);
//			} else {
//				System.out.printf("The number %d is NOT an Armstrong number.", number);
//			}
//		} else {
//			System.out.println("Please enter a whole number greater than 0.");
//		}

//    	==================================================================================================================
//		3. Write a program to see if a user entered string is a palindrome or not
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a word to check if is a Palindrome: ");

		String userInput = scanner.nextLine();

		if (isPalindrome(userInput)) {
			System.out.println("It is a palindrome");
		} else {
			System.out.println("It is NOT a palindrome");
		}

	}

	// A Palindrome is a word, phrase, or sequence that reads the same backward as
	// forward.

	// Function to check if a String is a Palindrome
	static boolean isPalindrome(String string) {

		string = string.toLowerCase().trim();

		int leftIndex = 0;
		int rightIndex = string.length() - 1;

		// Pointers pointing to the beginning
		// and the end of the string
//		

		// While there are characters to compare
		while (leftIndex < rightIndex) {

			// If there is a mismatch
			if (string.charAt(leftIndex) != string.charAt(rightIndex))
				return false;

			// Increment first pointer and
			// decrement the other
			leftIndex++;
			rightIndex--;
		}

		// Given string is a palindrome
		return true;

	}

	static boolean checkArmstrongNumber(int number) {

		int temporary;
		int lastDigit;
		int numberOfDigits = 0;
		int sum = 0;

		temporary = number;
		while (temporary > 0) {
			temporary = temporary / 10;
			numberOfDigits++;
		}

		temporary = number;
		while (temporary > 0) {
			lastDigit = temporary % 10;
			sum += (Math.pow(lastDigit, numberOfDigits));
			temporary = temporary / 10;
		}

		return number == sum;
	}

	static void fibonacciFunc(int num) {
		int firstNumber = 0;
		int secondNumber = 1;
		int nextNumber;

		for (int i = 0; i <= num; i++) {
			System.out.print(firstNumber + " ");
			nextNumber = firstNumber + secondNumber;
			firstNumber = secondNumber;
			secondNumber = nextNumber;
		}
	}

}
