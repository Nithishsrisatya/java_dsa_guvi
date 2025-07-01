import java.util.*;
public class StringRecursion{
    public static void printff(String str,int n){
        if(n == str.length()){
            return;
        }
        System.out.println(str.charAt(n));
        printff(str, n + 1);
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        printff(input, 0);
        scanner.close();
    }
}