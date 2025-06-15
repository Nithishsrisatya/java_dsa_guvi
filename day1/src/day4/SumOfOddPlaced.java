package day4;
import java.util.*;
public class SumOfOddPlaced {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number to find the sum of Odd placed even digits: ");
		int inputNumber = scanner.nextInt();
		int temp = inputNumber;
		int i = 0;
		int sumOfOddPlaced = 0;
		while(temp>0) {
			int remainder = temp % 10;
		    temp/=10;
			
			i += 1;
			if((i % 2 == 0) && (remainder % 2 == 0)) {
				sumOfOddPlaced = sumOfOddPlaced + remainder;
			}
		}
		System.out.println("the sum of Odd placed even digits of " + inputNumber + " is : " + sumOfOddPlaced);
		scanner.close();
	}
}
