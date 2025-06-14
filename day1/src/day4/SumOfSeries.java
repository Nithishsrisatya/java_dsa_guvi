package day4;
import java.util.*;
public class SumOfSeries {
	static int calculation(int N, int M) {
		int result=0;
		for(int i = 0;i<=N;i++) {
			 
		}
		return result;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the Value of N: ");
		int N = scanner.nextInt();
		System.out.print("\nEnter the No.of Terms M: ");
		int M = scanner.nextInt();
		int result = calculation(N, M);
		System.out.println("Sum of the Series: "+result);
		scanner.close();
	}
}
