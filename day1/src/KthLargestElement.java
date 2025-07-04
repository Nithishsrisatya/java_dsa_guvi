/* 
 * 03
"Kth Largest Element in an Array", 
"Find the kth largest element in an unsorted array using a heap.", 
"Medium", 
"LeetCode, Facebook, Amazon"

----------------------------------
Problem Title:
Kth Largest Element in an Array

Problem Description:
Given an unsorted array of integers and an integer k, find the kth largest element in the array. The kth largest element is the element that would be in the kth position if the array was sorted in descending order. Note that it is the kth largest element in sorted order, not the kth distinct element.

Input Format:
- The first line contains two integers n and k, where n is the number of elements in the array.
- The second line contains n space-separated integers representing the elements of the array.

Output Format:
- Output a single integer, the kth largest element in the array.

Constraints:
- 1 ≤ n ≤ 10^5
- 1 ≤ k ≤ n
- -10^9 ≤ array[i] ≤ 10^9

Sample Input:
6 2
3 2 1 5 6 4

Sample Output:
5

Explanation:
The sorted array in descending order is [6, 5, 4, 3, 2, 1]. The 2nd largest element is 5.

Difficulty:
Medium

Test Cases:
Test Case 1:
Input:
5 1
7 10 4 3 20
Output:
20

Test Case 2:
Input:
5 3
7 10 4 3 20
Output:
7

Test Case 3:
Input:
8 4
12 35 1 10 34 1 7 8
Output:
10

Test Case 4:
Input:
3 2
-1 -2 -3
Output:
-2

Test Case 5:
Input:
10 5
5 3 8 6 2 9 1 7 4 10
Output:
6


 */
import java.util.*;
public class KthLargestElement {
    private static int findLargest(int[] arr,int k ){
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int i = 0; i < arr.length; i++){
            minHeap.offer(arr[i]);
            if(minHeap.size() > k){
                minHeap.poll();
            }
        }
        return minHeap.peek();
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int result = findLargest(arr, k);
        System.out.println(result);
        sc.close();
    }
}
