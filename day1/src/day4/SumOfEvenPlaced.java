package day4;
import java.util.*;
public class SumOfEvenPlaced {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int inputNumber = scanner.nextInt();
		int temp = inputNumber;
		int i = 0;
		int sumOfEvenPlaced = 0;
		while(temp>0) {
			int remainder = temp % 10;
		    temp/=10;
			
			i += 1;
			if(i % 2 != 0) {
				sumOfEvenPlaced = sumOfEvenPlaced + remainder;
			}
		}
		System.out.println(sumOfEvenPlaced);
		scanner.close();
	}
}
