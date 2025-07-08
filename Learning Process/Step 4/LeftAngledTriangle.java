//package Learning Process.Step 4;
import java.util.*;
public class LeftAngledTriangle {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = obj.nextInt();
        for(int i = 0;i < n;i++){
            for(int j = 0;j <= n - i - 1;j++){
                System.out.print(" ");
            }
            for(int j = 0; j <= i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        obj.close();
    }
    
}
