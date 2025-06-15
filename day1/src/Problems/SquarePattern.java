package Problems;

import java.util.Scanner;

public class SquarePattern {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numberOfLines;
		System.out.print("Enter the Number of lines of Square(N): ");
		numberOfLines = scanner.nextInt();
		for(int i = 0;i < numberOfLines;i++) {
			for(int j = 0;j < numberOfLines;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		scanner.close();
	}
}