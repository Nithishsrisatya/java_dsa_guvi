package Problems;

import java.util.*;
public class HeapSort{
    public void buildHeap(List<Integer> arr){
        int n = arr.size();
        for(int i=n/2-1; i>=0; i--){
            heapify(arr, i, n);
        }
    }

    public void sort(List<Integer> arr){
        buildHeap(arr);
        for(int i=arr.size()-1; i>0; i--){
            int temp = arr.get(0);
            arr.set(0, arr.get(i));
            arr.set(i, temp);
            heapify(arr, 0, i);
        }
    }

    private void heapify(List<Integer> arr, int i, int n){
        int largest = i;
        int left = 2*i+1;
        int right = 2*i+2;
        if(left < n && arr.get(left) > arr.get(largest))
            largest = left;
        if(right < n && arr.get(right) > arr.get(largest))
            largest = right;
        if(largest != i){
            int temp = arr.get(i);
            arr.set(i, arr.get(largest));
            arr.set(largest, temp);
            heapify(arr, largest, n);
        }
    }
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> arr = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            arr.add(scanner.nextInt());
        }
        HeapSort heapSort = new HeapSort();
        heapSort.sort(arr);
        for (int i = 0; i < n; i++) {
            System.out.print(arr.get(i) + " ");
        }
        scanner.close();
    }
}