/* 
 * Write a program to get a list of integers as input and find the LCM of the values without using GCD


Input Description:
First line contains an integer N, number of values. Second line contains N space separated values.

Output Description:
Print the LCM of the values.

Sample Input :
1 2 3 4 5
Sample Output :
60
 */
import java.util.Scanner;
public class LCMWithoutHCF {
    public static int findLcm(int a, int b){
        int max = Math.max(a,b);
        while(true){
            if(max % a == 0 && max % b == 0){
                return max;
            }
            max++;
        }
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i < n;i++){
            arr[i] = obj.nextInt();
        }
        int lcm = arr[0];
        for(int i = 1;i < n;i++){
            lcm = findLcm(lcm, arr[i]);
        }
        System.out.print(lcm);
        obj.close();
    }
}