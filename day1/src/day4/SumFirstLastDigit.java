package day4;
import java.util.*;
public class SumFirstLastDigit {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the Digit to find the Sum of First and Last numbers: ");
		int inputNumber = scanner.nextInt();
		int firstDigit;
		int lastDigit;
		lastDigit = inputNumber % 10;
		firstDigit = inputNumber;
		while(firstDigit >= 10) {
			firstDigit /=  10;
		}
		int sumFirstLast = firstDigit + lastDigit;
		System.out.println("First and Last Digit of " + inputNumber + " is: " + firstDigit + " and " + lastDigit);
		System.out.println("Sum of First and Lst Digit of " + inputNumber + " is: " + sumFirstLast);
		scanner.close();
	}
}
