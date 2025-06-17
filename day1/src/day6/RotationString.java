package day6;

import java.util.Scanner;

public class RotationString {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the Original String: ");
		String originalString = scanner.nextLine();
		System.out.print("Enter the Right Rotated String: ");
		String rotatedString = scanner.nextLine();
		String result = rotatedString + rotatedString;
		if(result.contains(originalString)) {
			System.out.println("1");
		}
		else {
			System.out.println("-1");

		}
		
		scanner.close();
	}
}
