//Check if two strings are anagrams.
import java.util.*;
public class Anagrams{
    public static boolean anagrams(String s, String t){
        if(s.length() != t.length()){
            return false;
        }
        char[] sarr = s.toCharArray();
        char[] tarr = t.toCharArray();
        Arrays.sort(sarr);
        Arrays.sort(tarr);
        return Arrays.equals(sarr,tarr);
    }
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter first string: ");
        String input1 = obj.nextLine();
        System.out.println("Enter second string: ");
        String input2 = obj.nextLine();
        if(anagrams(input1, input2)){
            System.out.println("The strings are anagrams.");
        }
        else{
            System.out.println("The strings are not anagrams.");
        }
        obj.close();
    }
}