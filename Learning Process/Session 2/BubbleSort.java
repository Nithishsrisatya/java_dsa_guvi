import java.util.*;
public class BubbleSort {
    public static void sort(int[] arr,int n){
        int i, temp;
        boolean swap;
        do{
            swap = false;
            for(i = 0;i < n - 1;i++){
                if(arr[i] > arr[i + 1]){
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swap = true;
                }
            }
        }while(swap);
        for(i = 0;i < n;i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the Size of the Array: ");
        int n = obj.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the Elements of Array: ");
        for(int i = 0;i < n;i++){
            arr[i] = obj.nextInt();
        }
        sort(arr,n);
        obj.close();
    }
}
