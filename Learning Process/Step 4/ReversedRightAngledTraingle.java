//package Learning Process.Step 4;
import java.util.*;
public class ReversedRightAngledTraingle {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = obj.nextInt();
        for(int i = 0;i < n;i++){
            for(int j = n - 1;j >= i;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
        obj.close();
    }
}
