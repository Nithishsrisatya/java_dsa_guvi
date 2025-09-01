// Reverse a string without using built-in functions.
import java.util.*;
public class Reverse{
    public static String reverseString(String str){
        String result = "";
        for(int i = str.length() - 1;i >= 0;i--){
            result += str.charAt(i);
        }
        return result;
    }
    public static void main(String[] args){
        Scanner obj  = new Scanner(System.in);
        System.out.println("Enter a name: ");
        String input = obj.nextLine();
        String reversed = reverseString(input);
        System.out.println("Reversed String: " + reversed);
        obj.close();
    }
}