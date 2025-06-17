package day6;

import java.util.Scanner;
import java.util.Arrays;
public class ArrayDivide {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ente the Size of the Array: ");
		int sizeOfArray = scanner.nextInt();
		System.out.print("Enter the value of X and Y: ");
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		System.out.print("Enter the elements into the array: ");
		int[] arr = new int[sizeOfArray];
		for(int i = 0;i < sizeOfArray;i++) {
			arr[i] =scanner.nextInt(); 
		}
		Arrays.sort(arr);
		System.out.print("Sorted Array: ");
		for(int i = 0;i < sizeOfArray;i++) {
			System.out.print(arr[i] + " "); 
		}
		System.out.println("\nElements in Y array: ");
		for(int i = 0;i < y;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("\nElements in X array: ");
		for(int i = y;i < (x+y);i++) {
			System.out.print(arr[i] + " ");
		}
		int minX = arr[y];
		int maxY = arr[y-1];
		int p = minX - maxY ;
		System.out.println("\nThe value of P: " + p);
		scanner.close();
	}
}
