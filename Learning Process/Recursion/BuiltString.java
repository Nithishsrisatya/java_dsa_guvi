import java.util.*;
public class BuiltString{
    public static void printff(String str, int n,String built){
        if(n == str.length()){
            System.out.println(built);
            return;
        }
        built += str.charAt(n);
        System.out.println(built);
        System.out.println(str.charAt(n));
        printff(str, n + 1,built);
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        printff(input, 0,"");
        scanner.close();
    }
}