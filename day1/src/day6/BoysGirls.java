package day6;

import java.util.Scanner;
import java.util.Arrays;
class Problem{
	private int no_ofBoys;
	private int no_ofGirls;
	public Problem(){
		
	}
	public int getNo_ofBoys() {
		return no_ofBoys;
	}
	public void setNo_ofBoys(int no_ofBoys) {
		this.no_ofBoys = no_ofBoys;
	}
	public int getNo_ofGirls() {
		return no_ofGirls;
	}
	public void setNo_ofGirls(int no_ofGirls) {
		this.no_ofGirls = no_ofGirls;
	}
	public static String checkArrangement(int[] b, int[] g) {
        if (canAlternate(b, g) || canAlternate(g, b)) {
            return "YES";
        } else {
            return "NO";
        }
    }
    private static boolean canAlternate(int[] first, int[] second) {
        int n = first.length;
        int[] merged = new int[2 * n];
        for (int i = 0; i < n; i++) {
            merged[2 * i] = first[i];
            merged[2 * i + 1] = second[i];
        }

        for (int i = 1; i < merged.length; i++) {
            if (merged[i] < merged[i - 1]) {
                return false;
            }
        }
        return true;
    }
}
public class BoysGirls {
	public static String[] readData(int T) {
		String[] result = new String[T];
		for(int i = 0;i < T;i++) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter the size of array: ");
			int n = scanner.nextInt();
			System.out.println("Enter the  No.of the boys: " + n);
			System.out.println("Enter the No.of Girls: " + n);
			System.out.println("Enter the heights of boys: ");
			int[] boysHeight = new int[n];
			for(int j = 0;j < n;j++) {
				boysHeight[j] = scanner.nextInt();
			}
			System.out.println("Enter the heights of Girls: ");
			int[] girlsHeight = new int[n];
			for(int k = 0;k < n;k++) {
				girlsHeight[k] = scanner.nextInt();
			}
			Arrays.sort(boysHeight);
			Arrays.sort(girlsHeight);
			Problem p1 = new Problem();
			p1.setNo_ofBoys(n);
			p1.setNo_ofGirls(n);
			result[i] =  Problem.checkArrangement(boysHeight, girlsHeight);
			scanner.close();
		}
		return result;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the No.of Test Cases: ");
		int T = scanner.nextInt();
		String[] output = readData(T);
		System.out.println(output);
		scanner.close();
	}
}
