//Print all permutations of a string
import java.util.*;
public class Permutation {
    public static void printPermutations(String str, String result) {
        if (str.length() == 0) {
            System.out.println(result);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            String s = str.substring(0, i) + str.substring(i + 1);
            printPermutations(s, result + curr);
        }
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a name: ");
        String str = obj.nextLine();
        System.out.println("Permutations of " + str + ":");
        printPermutations(str, "");
        obj.close();
    }
}
