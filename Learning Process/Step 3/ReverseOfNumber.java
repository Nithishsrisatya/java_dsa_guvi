import java.util.*;
public class ReverseOfNumber{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = obj.nextInt();
        int reverse = 0;
        int temp = n;
        while(temp > 0){
            int digit = temp % 10;
            reverse = reverse * 10 + digit;
            temp /= 10;
        }
        System.out.println("Reverse of " + n + " is: " + reverse);
        obj.close();
    }
}