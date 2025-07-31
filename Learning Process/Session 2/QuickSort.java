import java.util.*;
public class QuickSort {
    public static int partition(int[] arr,int low,int high){
        int pivot = arr[high];
        int i = low - 1;
        for(int j = low;j < high;j++){
            if(arr[j] < pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        for(int num: arr){
            System.out.print(num + "   ");
        }
        System.out.println();
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }
    public static void quickSort(int[] arr,int low,int high){
        if(low < high){
            int p1 = partition(arr,low,high);
            System.out.println("p1: " + p1);
            quickSort(arr,0,p1 - 1);
            quickSort(arr,p1 + 1,high);
        }
    }
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the Size of Array: ");
        int n = obj.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements in Array: ");
        for(int i = 0;i < n;i++){
            arr[i] = obj.nextInt();
        }
        quickSort(arr,0,n-1);
        System.out.println("Array after sorting: ");
        for(int num: arr){
            System.out.print(num + " ");
        }
        obj.close();
    }
}
