
/* 
 * 01
"Implement Min Heap", 
"Write a class to implement a Min Heap with insert, extractMin, and heapify operations.", 
"Easy", 
"LeetCode, HackerRank, Amazon"
----------------------------------
Problem Title:
Implement Min Heap

Problem Description:
Design and implement a Min Heap data structure. A Min Heap is a complete binary tree where the value of each node is less than or equal to the values of its children. Implement the following operations:
1. insert(val): Insert an integer val into the heap.
2. extractMin(): Remove and return the minimum element from the heap.
3. heapify(arr): Build a Min Heap from an unsorted array arr.

Input Format:
The first line contains an integer n, the number of operations.
Each of the next n lines contains one of the following:
- "insert x" to insert integer x into the heap.
- "extractMin" to extract and print the minimum element.
- "heapify k x1 x2 ... xk" to build a heap from k integers x1 to xk (this replaces the current heap).

Output Format:
For every "extractMin" operation, print the extracted minimum element on a new line.

Constraints:
1 <= n <= 10^4
-10^6 <= x, x1, x2, ..., xk <= 10^6
1 <= k <= 10^4

Sample Input:
7
insert 5
insert 3
insert 8
extractMin
insert 2
extractMin
extractMin

Sample Output:
3
2
5

Explanation:
- Insert 5: Heap = [5]
- Insert 3: Heap = [3, 5]
- Insert 8: Heap = [3, 5, 8]
- extractMin: Output 3, Heap = [5, 8]
- Insert 2: Heap = [2, 8, 5]
- extractMin: Output 2, Heap = [5, 8]
- extractMin: Output 5, Heap = [8]

Difficulty:
Easy

Five Test Cases:
Test Case 1:
Input:
5
insert 10
insert 4
extractMin
insert 7
extractMin
Output:
4
7

Test Case 2:
Input:
6
insert 1
insert 2
insert 3
extractMin
extractMin
extractMin
Output:
1
2
3

Test Case 3:
Input:
4
heapify 3 9 6 2
extractMin
extractMin
extractMin
Output:
2
6
9

Test Case 4:
Input:
7
insert 20
insert 15
insert 30
extractMin
insert 10
extractMin
extractMin
Output:
15
10
20

Test Case 5:
Input:
3
insert -5
insert -10
extractMin
Output:
-10

 */
import java.util.*;
public class MinHeap {
    static List<Integer> arr;
    public MinHeap() {
        arr = new ArrayList<>();
    }
    public void offer(int val){
        arr.add(val);
        heapifyUp(arr.size() - 1);
    }
    public int peek(){
        return arr.get(0);
    }
    public int poll(){
        int result = peek();
        swap(0,arr.size() - 1);
        arr.removeLast();
        heapifyDown(0);
        return result;
    }
    public void heapifyDown(int nodeIndex){
        int left = 2 * nodeIndex +1;
        int right = 2 * nodeIndex +2;
        int smallest = nodeIndex;
        if(left < arr.size() && arr.get(left) < arr.get(smallest)){
            smallest = left;     
        }
        if(right < arr.size() && arr.get(right) < arr.get(smallest)){
            smallest = right;
        }
        if(smallest != nodeIndex){
            swap(nodeIndex, smallest);
            heapifyDown(smallest);
        }
    }
    private void swap(int i, int j){
        int temp = arr.get(i);
        arr.set(i,arr.get(j));
        arr.set(j,temp);
    }
    public void heapifyUp(int nodeIndex){
        int parentIndex = (nodeIndex - 1)/2;
        if(arr.get(nodeIndex) < arr.get(parentIndex)){
            swap(nodeIndex, parentIndex);
            heapifyUp(parentIndex);
        }
    }
    public void buildHeap(List<Integer> newArr){
        arr = newArr;
        for(int i = (arr.size() / 2) - 1; i >= 0; i--){
            heapifyDown(i);
        }
    }
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        MinHeap minHeap = new MinHeap();
        int n = obj.nextInt();
        for(int i = 0; i < n; i++){
            String operation = obj.next();
            if(operation.equals("insert")){
                int value = obj.nextInt();
                minHeap.offer(value);
            } else if(operation.equals("extractMin")){
                System.out.println(minHeap.poll());
            } else if(operation.equals("heapify")){
                int k = obj.nextInt();
                List<Integer> newArr = new ArrayList<>();
                for(int j = 0; j < k; j++){
                    newArr.add(obj.nextInt());
                }
                minHeap.buildHeap(newArr);
            }
        }
        obj.close();
    }
}
