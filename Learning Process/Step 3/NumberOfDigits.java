//package Step 3;
import java.util.*;
public class NumberOfDigits {
    public static void main(String[] args){
        Scanner  obj = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = obj.nextInt();
        int count = 0;
        int temp = n;
        while(temp > 0){
            temp /= 10;
            count++;
        }
        System.out.println("Number of Digits in " + n + " are: " + count);
        obj.close();
    }
}
