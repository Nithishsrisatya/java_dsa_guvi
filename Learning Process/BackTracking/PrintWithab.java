import java.util.*;
public class PrintWithab{
    public static void generateBinary(int[] n, String ans){
        if(ans.length() == n.length){
            System.out.println(ans);
            return;
        }
        generateBinary(n, ans + String.valueOf(n[ans.length()]));
        if(ans.length() < n.length - 1){
            generateBinary(n, ans + String.valueOf(n[ans.length() + 1]));
        }

    }
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = obj.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elments:\n");
        for(int i=0; i<n; i++){
            nums[i] = obj.nextInt();
        }
        generateBinary(nums,"");
        obj.close();
    }
}