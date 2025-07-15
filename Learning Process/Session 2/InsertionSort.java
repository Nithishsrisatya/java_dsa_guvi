import java.util.*;
public class InsertionSort{
    public static void insertionSort(int[] arr,int n){
        for(int i = 1;i < n;i++){
            int key = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > key){
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the Size of Array: ");
        int n = obj.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements in Array: ");
        for(int i = 0;i < n;i++){
            arr[i] = obj.nextInt();
        }
        insertionSort(arr,n);
        System.out.println("Array after sorting: ");
        for(int num: arr){
            System.out.print(num + " ");
        }
        obj.close();
    }
}