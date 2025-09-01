//Reverse an array without using extra space.
import java.util.*;
public class ReverseArray{
    public static void reverseArray(int[] num){
        int left = 0;
        int right = num.length - 1;
        while(left < right){
            int temp = num[left];
            num[left] = num[right];
            num[right] = temp;
            left++;
            right--;
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
        reverseArray(arr);
        System.out.println("Reversed Array: ");
        for(int num : arr){
            System.out.print(num + " ");
        }
        obj.close();
    }
}