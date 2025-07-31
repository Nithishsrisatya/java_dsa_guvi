import java.util.*;
public class PrintWithab{
    public static void generateBinary(int n, String ans){
        if(ans.length() == n){
            System.out.println(ans);
            return;
        }
        generateBinary(n, ans +"a");
        generateBinary(n, ans + "b");
    }
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = obj.nextInt();
        generateBinary(n,"");
        obj.close();
    }
}