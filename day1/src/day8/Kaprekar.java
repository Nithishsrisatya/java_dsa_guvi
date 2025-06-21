package day8;
import java.util.Arrays;
import java.util.Scanner;
public class Kaprekar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a 4-digit number: ");
        int s = scanner.nextInt();
        scanner.close();
        if (s < 1000 || s > 9999) {
            System.out.println("Please enter a valid 4-digit number.");
            return;
        }
        while (s != 6174) {
            String numStr = String.format("%04d", s);
            char[] digits = numStr.toCharArray();
            Arrays.sort(digits);
            String ascStr = new String(digits);
            StringBuilder sb = new StringBuilder(ascStr);
            String desStr = sb.reverse().toString();
            int asc = Integer.parseInt(ascStr);
            int des = Integer.parseInt(desStr);
            s = des - asc;
            System.out.printf("%s - %s = %04d\n", desStr, ascStr, s);
            if (s == 0) {
                System.out.println("Reached 0000 — cannot proceed further.");
                break;
            }
        }
    }
}
