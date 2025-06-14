package day4;

import java.util.Scanner;

public class SecondSmallest {
	private static int secondSmallestNumber = 0;
	private static int minimumNumber = 9;
	public static void findSecondSmallestNumber(int sizeOfArray, int[] array) {
		for( int i =0; i < sizeOfArray; i++) {
			if(minimumNumber > array[i]) {
				secondSmallestNumber = minimumNumber;
				minimumNumber = array[i];
			}
			else if((minimumNumber < array[i]) && (secondSmallestNumber > array[i])) {
				secondSmallestNumber = array[i];
			}
		}
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the Size of the Array: ");
		int sizeOfArray = scanner.nextInt();
		System.out.println("Enter the Numbers into the Array: ");
		int[] array = new int[sizeOfArray];
		for(int i = 0; i < sizeOfArray; i++) {
			array[i] = scanner.nextInt();
		}
		findSecondSmallestNumber(sizeOfArray, array);
		System.out.println("The Second Smallest Number of the Given Array: " + secondSmallestNumber);
		scanner.close();
	}
}
