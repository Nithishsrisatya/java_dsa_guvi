/* 
 * "Min Cost Climbing Stairs", 
"Given an array where each element is the cost to step on that stair, find the minimum cost to reach the top.", 
"Easy", 
"LeetCode, Amazon"

----------------------------------

Problem Title:
Min Cost Climbing Stairs

Problem Description:
You are given an integer array cost where cost[i] is the cost of step i on a staircase. Once you pay the cost, you can either climb one or two steps. You can start from step 0 or step 1. Your goal is to reach the top of the staircase (beyond the last index) with the minimum total cost.

Input Format:
- The first line contains an integer n, the number of stairs.
- The second line contains n space-separated integers, the cost of each stair.

Output Format:
- A single integer representing the minimum cost to reach the top of the staircase.

Constraints:
- 2 <= n <= 1000
- 0 <= cost[i] <= 999

Sample Input:
6
10 15 20 5 10 5

Sample Output:
20

Explanation:
You can start at step 1 (cost 15), then step to 3 (cost 5), then to 5 (cost 5), and finally reach the top. Total cost = 15 + 5 + 5 = 25. But a cheaper way is: step 0 (10), step 2 (20), step 4 (10), total cost = 10 + 20 + 10 = 40. The minimum is 20 by taking steps 1 -> 3 -> 5.

"You can start at step 1 (cost 15), then step to 3 (cost 5), then jump directly to the top. Total cost = 15 + 5 = 20. This is cheaper than other paths like 0→2→4→top (cost 40) or 1→3→5→top (cost 25)."

Difficulty:
Easy

Five Test Cases:
Test Case 1:
Input:
2
1 100
Output:
1

Test Case 2:
Input:
3
10 15 20
Output:
15

Test Case 3:
Input:
5
1 100 1 1 1
Output:
3

Test Case 4:
Input:
4
0 0 0 0
Output:
0

Test Case 5:
Input:
7
5 10 15 20 25 30 35
Output:
40

 */
import java.util.*;
public class MinCostStairs {
    public static int minCost(int[] cost,int n){
        int[] dp = new int[n + 1];
        dp[0] = cost[0];
        dp[1] = cost[1];
        for (int i = 2; i < n; i++) {
            dp[i] = cost[i] + Math.min(dp[i - 1], dp[i - 2]);
        }

        return Math.min(dp[n - 1], dp[n - 2]);
    }
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i < n;i++){
            arr[i] = obj.nextInt();
        }
        int result = minCost(arr, n);
        System.out.println(result);
        obj.close();
    }
    
}
