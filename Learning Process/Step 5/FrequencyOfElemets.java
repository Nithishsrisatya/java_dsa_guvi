//package Learning Process.Step 5;
import java.util.*;
public class FrequencyOfElemets {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the size of Array: ");
        int size = obj.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of array: ");
        for(int i = 0;i < size;i++){
            arr[i] = obj.nextInt();
        }
        Map<Integer, Integer> freq = new HashMap<>();
        for(int i = 0;i < size;i++){
            int count = 1;
            freq.put(arr[i],freq.getOrDefault(freq,count)+ 1);
        }
        for(Map.Entry<Integer, Integer> entry : freq.entrySet()){
            System.out.println(entry.getKey() + "->" + entry.getValue());
        }
        obj.close();
    }
}
