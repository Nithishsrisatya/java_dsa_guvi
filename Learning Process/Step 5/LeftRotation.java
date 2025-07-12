//package Learning Process.Step 5;
import java.util.*;
public class LeftRotation {
    public static void reverse(int[] arr,int start,int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void leftRotate(int[] arr, int d){
        int n = arr.length;
        d = d % n;
        reverse(arr, 0 ,d - 1);
        reverse(arr, d, n -1);
        reverse(arr,0,n-1);
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the Size of the Array: ");
        int size = obj.nextInt();
        System.err.println("Enter the Elements of Array: ");
        int[] arr = new int[size];
        for(int i = 0;i < size;i++){
            arr[i] = obj.nextInt();
        }
        System.out.println("Enter the No.Of left Rotations: ");
        int d = obj.nextInt();
        leftRotate(arr,d);
        for(int num : arr){
            System.out.print(num + " ");
        }
        obj.close();
    }
}
