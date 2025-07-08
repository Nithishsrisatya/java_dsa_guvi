//package Learning Process.Step 4;
import java.util.*;
public class FloydTriangle {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = obj.nextInt();
        int num = 1;
        for(int i = 1;i <= n;i++){
            for(int j = 1;j <= i;j++){
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
        obj.close();
    }
    
}
