//Find the largest and smallest element in an array.
import java.util.*;

public class LargestAndSmallest{
    public static int findLargest(int[] arr){
    int largest = arr[0];
    for(int i = 1; i < arr.length; i++){
        if(arr[i] > largest){
            largest = arr[i];
        }
    }
    return largest;
}

    public static int findSmallest(int[] arr){
    int smallest = arr[0];
    for(int i = 1; i < arr.length; i++){
        if(arr[i] < smallest){
            smallest = arr[i];
        }
    }
    return smallest;
}

    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the Size of Array:");
        int n = obj.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the Elements of Array: ");
        for(int i = 0;i < n;i++){
            arr[i] = obj.nextInt();
        }
        int largest = findLargest(arr);
        int smallest = findSmallest(arr);
        System.out.println("Largest Element: " + largest);
        System.out.println("Smallest Element: " + smallest);
        obj.close();
    }
}