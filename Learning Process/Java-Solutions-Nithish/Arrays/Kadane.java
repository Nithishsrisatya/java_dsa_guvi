//Find the subarray with maximum sum (Kadane’s Algorithm).
import java.util.*;
public class Kadane{
    public static int kadaneAlgorithm(int[] num){
        int maxSum = Integer.MIN_VALUE;
        int curr = 0;
        for(int i = 0;i < num.length;i++){
            curr += num[i];
            if(curr > maxSum){
                maxSum = curr;
            }
            else{
                curr = Math.max(curr, 0);
            }
        }
        return maxSum;

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
        int maxSum = kadaneAlgorithm(arr);
        System.out.println("Max Sum Subarray: " + maxSum);
        obj.close();
    }
}