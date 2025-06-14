package day1;
import java.util.Scanner;
public class PerfectSquare {
	private int inputNumber;
	public PerfectSquare(int inputNumber) {
		this.inputNumber = inputNumber;
	}
	void isPerfectSquare() {
		int squareRootNumber = (int) Math.sqrt(inputNumber);
		if(squareRootNumber*squareRootNumber == inputNumber) {
			System.out.println(inputNumber + " is a Perfect Square");
		}
		else {
			System.out.println(inputNumber + " is not a Perfect Sqaure Number");
		}
	}
	
 public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);
	 System.out.print("Enter a Number to check if it is a Perfect Square or not: ");
	 int inputNumber = scanner.nextInt();
	 PerfectSquare p1 = new PerfectSquare(inputNumber);
	 p1.isPerfectSquare();
	 scanner.close();
 }
}
