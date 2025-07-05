/* 
 * "Longest Increasing Subsequence", 
"Given an array of integers, 
find the length of the longest strictly increasing subsequence.", 
"Medium", 
"LeetCode, Amazon, Microsoft"

----------------------------------
Problem Title:
Longest Increasing Subsequence

Problem Description:
Given an array of integers, find the length of the longest strictly increasing subsequence. A subsequence is a sequence that can be derived from the array by deleting some or no elements without changing the order of the remaining elements. The subsequence must be strictly increasing, meaning each element is greater than the previous one.

Input Format:
- The first line contains an integer n, the number of elements in the array.
- The second line contains n space-separated integers representing the elements of the array.

Output Format:
- Print a single integer, the length of the longest strictly increasing subsequence.

Constraints:
- 1 ≤ n ≤ 2500
- -10^4 ≤ array[i] ≤ 10^4

Sample Input:
6
10 9 2 5 3 7

Sample Output:
3

Sample Explanation:
The longest strictly increasing subsequence is [2, 5, 7], so the answer is 3.

Difficulty:
Medium

Five Test Cases:
Test Case 1:
Input:
8
1 3 2 4 3 5 4 6
Output:
5

Test Case 2:
Input:
5
5 4 3 2 1
Output:
1

Test Case 3:
Input:
7
1 2 3 4 5 6 7
Output:
7

Test Case 4:
Input:
10
10 22 9 33 21 50 41 60 80 1
Output:
6

Test Case 5:
Input:
1
100
Output:
1


 */
import java.util.*;
public class LongestIncreasingSubsequence {
    public static int find(int[] arr,int n){
        int[] dp = new int[n];
        Arrays.fill(dp, 1);
        for(int i = 0;i < n;i++){
            for(int j = 0;j < i;j++){
                if(arr[i] > arr[j]){
                    dp[i] = Math.max(dp[i],dp[j] + 1);
                }
            }
        }
        int max = Arrays.stream(dp).max().getAsInt();
        return max;
    }
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int[] array = new int[n];
        for(int i = 0;i < n;i++){
            array[i] = obj.nextInt();
        }
        int result = find(array,n);
        System.out.println(result);
        obj.close();
    }
}
