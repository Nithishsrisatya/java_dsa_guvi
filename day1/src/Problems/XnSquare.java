package Problems;

import java.util.Scanner;

public class XnSquare {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numberOfLines;
		System.out.print("Enter the Number of lines of X in Hollow Square(N): ");
		numberOfLines = scanner.nextInt();
		for(int i = 1;i <= numberOfLines;i++) {
			for(int j = 1;j <= numberOfLines;j++) {
				if(i == 1 || i == numberOfLines || j == 1 || j == numberOfLines || i == j || j == (numberOfLines - i) + 1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		scanner.close();
	}
}
