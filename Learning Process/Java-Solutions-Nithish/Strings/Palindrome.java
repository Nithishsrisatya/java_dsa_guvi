//Check if a string is a palindrome.
import java.util.*;
public class Palindrome {
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a name: ");
        String input = obj.nextLine();
        if (isPalindrome(input)) {
            System.out.println("The string is a palindrome.");
        } 
        else {
            System.out.println("The string is not a palindrome.");
        }
        obj.close();
    }
}