//package Learning Process.Step 4;
import java.util.*;
public class PrintAllPairs {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the size of the Array: ");
        int size = obj.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the Array: ");
        for(int i = 0;i < size;i++){
            arr[i] = obj.nextInt();
        }
        for(int i = 0;i < size ;i++){
            for(int j = i ;j < size;j++){
                if(i != j){
                    System.out.print("(" + arr[i] + ", " + arr[j] + ")");
                }
            }
        }
        obj.close();
    }
}
