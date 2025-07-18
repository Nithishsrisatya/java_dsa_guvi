package day4;
import java.util.*;
public class CountPrime {
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
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int inputNumber;
		System.out.print("Enter the Number to find the no.of prime numbers: ");
		inputNumber = scanner.nextInt();
		int countPrime = 0 ;
		int temp = inputNumber;
		while(temp > 0) {
			int reminder = temp % 10;
			if(isPrime(reminder)) {
				countPrime++;
			}
			temp /= 10;
		}
		System.out.println("No.of Prime in this number " + inputNumber + " is: " + countPrime);
		scanner.close();
	}
}
