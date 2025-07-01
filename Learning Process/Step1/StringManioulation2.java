/* 
 * Using String Class

Problem Statement
Create a Java program that reads a string from the user and performs various operations using the String class. The program should reverse the string, convert it to uppercase, and find the first non-repeated character.

Description
The program should read a string, reverse it, convert it to uppercase, and find the first non-repeated character in the string. If all characters are repeated, output "No non-repeated character found."

Input Format
A single string.

Output Format
The reversed string.
The uppercase string.
The first non-repeated character or "No non-repeated character found."

Sample Input:
openai

Sample Output:
ianepo
OPENAI
o



 */
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
public class StringManioulation2 {
    public static boolean isCount(int n,String[] arr){
        int cnt = 0;
        for(int i = 0;i < arr.length;i++){
            if(arr[n] == arr[i]){
                cnt++;
            }
        }
        if(cnt == 1){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder name = new StringBuilder(s);
        System.out.println(name.reverse());
        System.out.println(s.toUpperCase());
        String[] arr = s.strip().split("");
        for(int i = 0;i < arr.length;i++){
            if(isCount(i, arr)){
                System.out.print(arr[i]);
                break;
            }
        }
        sc.close();
    }
}

