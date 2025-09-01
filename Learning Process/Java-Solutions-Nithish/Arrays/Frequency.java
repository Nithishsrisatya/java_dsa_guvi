// Find the frequency of each element in an array.
import java.util.*;
public class Frequency{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the Size of Array: ");
        int n = obj.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the Elements in the Array: ");
        for(int i = 0;i < n;i++){
            arr[i] = obj.nextInt();
        }
        Map<Integer,Integer> map = new HashMap<>();
        for(int num : arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        System.out.println("Element Frequencies: ");
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        obj.close();
    }
}