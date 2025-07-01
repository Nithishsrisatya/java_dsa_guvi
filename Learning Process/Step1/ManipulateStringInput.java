/* 
 * Using String Class

Problem Statement:
Create a program that manipulates strings to format user input in a specific way.

Description:
The program should read a full name from the user in the format "first last" and print it in the format "Last, First". It should also check if the name contains a middle name and handle it appropriately.

Input Format:
A single string representing the full name.

Output Format:
The name in the format "Last, First" or "Last, First Middle".

Sample Input:
Jane Mary Smith

Sample Output:
Smith, Jane Mary
 */
import java.util.*;
public class ManipulateStringInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] name = s.strip().split(" ");
        int len = name.length;
        if(len == 0){
            System.out.println("Invalid Input");
        }
        else if(len  == 1){
            System.out.println(name[0]);
        }
        else if(len  == 2){
            System.out.println(name[1] + ", " + name[0]);
        }
        else{
            System.out.print(name[len - 1] + ", " + name[0]);
            for(int i = 1;i < len - 1;i++){
                System.out.print(" " + name[i]);
            }
        }
        sc.close();
    }
}

