package Problems;

import java.util.Scanner;

public class XnSquare {
	private static int inputNumber;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Number of lines of X in Hollow Square(N): ");
        inputNumber = scanner.nextInt();
        int center = (inputNumber + 1) / 2; 
        for (int i = 1; i <= inputNumber; i++) {
            for (int j = 1; j <= inputNumber; j++) {
                boolean isBorder = i == 1 || i == inputNumber || j == 1 || j == inputNumber;
                boolean isDiagonal = i == j || j == (inputNumber - i + 1);
                boolean isCenter = i == center && j == center;

                if (isCenter) {
                    System.out.print("@");
                } else if (isBorder || isDiagonal) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        scanner.close();
    }
}
