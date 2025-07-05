//package Step 3;
import java.util.*;
public class FirstNnatualNumbers {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = obj.nextInt();
        int sum = 0;
        for(int i = 1;i <= n;i++){
            sum += i;
        }
        System.out.println("Sum of " + n + " natuarl numbers is: " + sum);
        obj.close();
    }
}
