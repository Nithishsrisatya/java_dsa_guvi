package day4;
import java.util.Scanner;

public class SumOfOddDigits {
	private static int inputNumber;
	private static int sumOfOddDigit;
	public static void sumOfOdd(int inputNumber) {
		sumOfOddDigit = 0;
		while(inputNumber > 0) {
			int reminder = inputNumber % 10;
			if(reminder % 2 != 0) {
				sumOfOddDigit = sumOfOddDigit + reminder;
			}
			inputNumber = inputNumber / 10;
		}
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the Number to find the sum of Odd Digiys in it: ");
		inputNumber = scanner.nextInt();
		sumOfOdd(inputNumber);
		System.out.println("Sum of The Odd Digits in the Given Number: " + sumOfOddDigit);

		scanner.close();
	}
}
