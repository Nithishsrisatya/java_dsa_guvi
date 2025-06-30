/* 
 * Write a code to get 2 integers as input and add the integers without any carry.


Input Description:
A single line containing 2 integers.

Output Description:
Print sum of the 2 integers without carry

Sample Input :
44 66
Sample Output :
0

 */
import java.util.Scanner;
public class SumWithoutCarry {
    public static void main(String[] args) {
       Scanner obj = new Scanner(System.in);
       int a = obj.nextInt();
       int b = obj.nextInt();
       int place = 1;
       int result = 0;
       while(a > 0 || b > 0){
           int digit1 = a%10;
           int digit2 = b % 10;
           int sumWithoutCarry = (digit1 + digit2) % 10;
           result += sumWithoutCarry * place;
           a /= 10;
           b /= 10;
           place *= 10;
       }
       System.out.print(result);
       obj.close();
    }
}