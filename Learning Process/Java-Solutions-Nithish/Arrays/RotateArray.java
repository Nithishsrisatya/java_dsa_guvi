//Rotate an array (left or right) by k positions.
import java.util.*;
public class RotateArray{
    public static void rotateArray(int[] num, int k){
        if(num == null || num.length == 0 || k < 0){
            return;
        }
        k = k % num.length;
        reverse(num,0,k - 1);
        reverse(num ,k ,num.length - 1);
        reverse(num,0,num.length - 1);
    }
    public static void reverse(int[] nums, int start, int end){
        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }

    }
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the Size of Array: ");
        int n = obj.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the Elements in the Array: ");
        for(int i = 0;i < n;i++){
            arr[i] = obj.nextInt();
        }
        System.out.println("Enter the number of positions to rotate: ");
        int k = obj.nextInt();
        rotateArray(arr, k);
        System.out.println("Array after rotation: ");
        for(int num : arr){
            System.out.print(num + " ");
        }
        obj.close();
    }
}