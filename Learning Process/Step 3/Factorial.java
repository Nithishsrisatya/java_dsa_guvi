//package Step 3;
import java.util.*;
public class Factorial {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n = obj.nextInt();
        int result = 1;
        for(int i = 1;i <= n;i++){
            result *= i;
        }
        System.out.println( n + "! is: " + result);
        obj.close();
    }
}
