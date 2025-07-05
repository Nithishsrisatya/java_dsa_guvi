
/* 
"Fibonacci Number", 
"Compute the nth Fibonacci number using dynamic programming.", 
"Easy", 
"LeetCode, Google"

----------------------------------

Problem Title: Fibonacci Number

Problem Description:
Given an integer n, compute the nth Fibonacci number. The Fibonacci sequence is defined as follows:
- F(0) = 0
- F(1) = 1
- F(n) = F(n-1) + F(n-2) for n > 1

Write a program that calculates the nth Fibonacci number using dynamic programming.

Input Format:
A single integer n.

Output Format:
A single integer representing the nth Fibonacci number.

Constraints:
0 <= n <= 40

Sample Input 1:
5

Sample Output 1:
5

Explanation:
The Fibonacci sequence is: 0, 1, 1, 2, 3, 5, 8, ...
The 5th Fibonacci number is 5.

Sample Input 2:
0

Sample Output 2:
0

Explanation:
The 0th Fibonacci number is 0.

Difficulty:
Easy

Five Test Cases:
Test Case 1:
Input: 0
Output: 0

Test Case 2:
Input: 1
Output: 1

Test Case 3:
Input: 7
Output: 13

Test Case 4:
Input: 10
Output: 55

Test Case 5:
Input: 20
Output: 6765


*/


import java.util.*;
public class Fabinocci {
    public static int fibnocci(int n){
        if(n <= 1){
            return n;
        }
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for(int i = 2;i <= n;i ++){
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result = fibnocci(n);
        System.out.println(result);
        scanner.close();
    }
}
