package day4;
import java.util.*;
public class FindnthDigit {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the Digit: ");
		String inputDigit = scanner.nextLine();
		System.out.print("Enter the Nth number to find the Digit: ");
		int nthDigit = scanner.nextInt();
		int length = inputDigit.length();
		if (nthDigit > 0 && nthDigit <= length) {
            char digit = inputDigit.charAt(nthDigit - 1);
            System.out.println("The (" + inputDigit + ")th digit is: " + digit);
        } else {
            System.out.println("Invalid position!");
        }
		scanner.close();
	}
}
