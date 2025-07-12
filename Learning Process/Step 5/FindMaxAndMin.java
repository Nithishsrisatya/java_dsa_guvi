//package Learning Process.Step 5;
import java.util.*;
public class FindMaxAndMin {
    public static void findMaxandMin(int[] arr,int n){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 0;i < n;i++){
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("Maximum ELment in the Array is: " + max);
        System.out.println("Minimum Element in the Array is: " + min);
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the size of Array: ");
        int size = obj.nextInt();
        System.out.println("Enter the elements into the array: ");
        int[] arr = new int[size];
        for(int i = 0;i < size;i++){
            arr[i] = obj.nextInt();
        }
        findMaxandMin(arr,size);
        obj.close();
    }
}
