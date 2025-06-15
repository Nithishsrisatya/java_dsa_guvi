package day4;
import java.util.*;
public class FindSmallestBiggestNum {
	private static int maximumNumber = Integer.MIN_VALUE;
	private static int minimumNumber = Integer.MAX_VALUE;
	public static void findSmallestNumber(int sizeOfArray, int[] array) {
		for(int i = 0;i < sizeOfArray;i++) {
			if(minimumNumber > array[i]) {
				minimumNumber = array[i];
			}
		}
	}
	public static void findLargestNumber(int sizeOfArray, int[] array) {
		for(int i = 0;i < sizeOfArray;i++) {
			if(maximumNumber < array[i]) {
				maximumNumber = array[i];
			}
		}
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the Size of the Array: ");
		int sizeOfArray = scanner.nextInt();
		System.out.println("Enter the Number into the Array: ");
		int[] array = new int[sizeOfArray];
		for(int i = 0;i < sizeOfArray;i++) {
			array[i] = scanner.nextInt();
		}
		findLargestNumber(sizeOfArray, array);
		findSmallestNumber(sizeOfArray, array);
		System.out.println("The Largest number of the Array: " + maximumNumber);
		System.out.println("The Smallest Number of the Array: " + minimumNumber);
		scanner.close();
	}
}
