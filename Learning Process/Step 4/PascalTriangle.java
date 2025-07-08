//package Learning Process.Step 4;
import java.util.*;
public class PascalTriangle {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = obj.nextInt();
        for(int i = 1;i <= n;i++){
            for(int j = 0;j < n - i;j++){
                System.out.print(" ");
            }
            int num = 1;
            for(int j = 1;j <= i;j++){
                System.out.print(num + " ");
                num = num *(i - j)/j;
            }
            System.out.println();
        }
        obj.close();
    }
    
}
