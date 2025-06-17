package day5;

import java.util.Scanner;
class Problem{
	private int firstNumber;
	private int secondNumber;
	public Problem(){
	}
	public Problem(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }
	
	public  int getFirstNumber() {
		return firstNumber;
	}
	public  void setFirstNumber(int firstNumber) {
		this.firstNumber = firstNumber;
	}
	public int getSecondNumber() {
		return secondNumber;
	}
	public  void setSecondNumber(int secondNumber) {
		this.secondNumber = secondNumber;
	}
	public static boolean isPrime(int number) {
		if(number <= 1) {
			return false;
		}
		else {
			for(int i = 2;i <= (int)Math.sqrt(number);i++) {
				if(number % i == 0) {
					return false;
				}
			}
			return true;
		}
	}
	public void printt() {
		System.out.println("The Prime numbers int the Range " + firstNumber + " and " + secondNumber + " are: ");
		for(int i = firstNumber;i <= secondNumber;i++) {
			if(isPrime(i)) {
				System.out.print(i + " ");
			}
		}
	}
}
public class NumberOfPrimesInRange{
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the Numbers to find No.of Prime int that Range: ");
		int firstNumber = scanner.nextInt();
		int secondNumber = scanner.nextInt();
		Problem p1 = new Problem();
		p1.setFirstNumber(firstNumber);
		p1.setSecondNumber(secondNumber);
		p1.printt();
		scanner.close();
	}
}
