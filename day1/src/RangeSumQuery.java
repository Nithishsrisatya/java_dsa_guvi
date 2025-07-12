/* 
 * "Range Sum Query with Updates using Segment Tree", 
"Given an array, efficiently perform range sum queries and point updates.", 
"Medium", 
"LeetCode, Codeforces, Amazon"

----------------------------------
Problem Title:
Range Sum Query with Updates using Segment Tree

Problem Description:
You are given an array of integers of size N. You need to efficiently perform the following two types of operations:
1. Update the value at a specific index in the array.
2. Query the sum of elements in a given range [L, R] (inclusive).

Implement a data structure that supports these operations efficiently.

Input Format:
- The first line contains two integers N and Q, the size of the array and the number of queries.
- The second line contains N integers, the initial elements of the array.
- The next Q lines each contain a query in one of the following formats:
    - "1 X Y": Update the value at index X (0-based) to Y.
    - "2 L R": Output the sum of elements from index L to R (inclusive).

Output Format:
For each query of type 2, output the sum on a new line.

Constraints:
- 1 ≤ N, Q ≤ 10^5
- 0 ≤ X, L, R < N
- -10^9 ≤ array elements, Y ≤ 10^9
- L ≤ R

Sample Input:
5 5
1 2 3 4 5
2 1 3
1 2 10
2 1 3
1 4 -2
2 3 4

Sample Output:
9
16
2

Explanation:
- The initial array is [1, 2, 3, 4, 5].
- Query 1: Sum from index 1 to 3 is 2+3+4=9.
- Query 2: Update index 2 to 10. Array becomes [1, 2, 10, 4, 5].
- Query 3: Sum from index 1 to 3 is 2+10+4=16.
- Query 4: Update index 4 to -2. Array becomes [1, 2, 10, 4, -2].
- Query 5: Sum from index 3 to 4 is 4+(-2)=2.

Difficulty:
Medium

Five Test Cases:
Test Case 1:
Input:
3 3
1 2 3
2 0 2
1 1 5
2 0 2
Output:
6
9

Test Case 2:
Input:
4 4
5 8 6 3
2 1 2
1 0 7
2 0 1
2 2 3
Output:
14
15
9

Test Case 3:
Input:
6 5
2 4 6 8 10 12
2 0 5
1 3 0
2 2 4
1 5 -5
2 4 5
Output:
42
24
5

Test Case 4:
Input:
2 2
100 -100
2 0 1
1 1 100
Output:
0

Test Case 5:
Input:
1 3
7
2 0 0
1 0 3
2 0 0
Output:
7
3
----------------------------------

 */
import java.io.*;
import java.util.*;

public class RangeSumQuery {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int Q = Integer.parseInt(input[1]);
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        SegmentTree segmentTree = new SegmentTree(arr);
        for (int i = 0; i < Q; i++) {
            String[] query = br.readLine().split(" ");
            if (query[0].equals("1")) {
                segmentTree.update(Integer.parseInt(query[1]), Integer.parseInt(query[2]));
            } else {
                System.out.println(segmentTree.query(Integer.parseInt(query[1]), Integer.parseInt(query[2])));
            }
        }
    }
}

class SegmentTree {
    private long[] tree;
    private int n;

    public SegmentTree(int[] arr) {
        n = arr.length;
        tree = new long[4 * n];
        build(arr, 0, n - 1, 1);
    }

    private void build(int[] arr, int l, int r, int idx) {
        if (l == r) {
            tree[idx] = arr[l];
            return;
        }
        int mid = (l + r) / 2;
        build(arr, l, mid, 2 * idx);
        build(arr, mid + 1, r, 2 * idx + 1);
        tree[idx] = tree[2 * idx] + tree[2 * idx + 1];
    }

    public void update(int pos, int val) {
        updateUtil(0, n - 1, 1, pos, val);
    }

    private void updateUtil(int l, int r, int idx, int pos, int val) {
        if (l == r) {
            tree[idx] = val;
            return;
        }
        int mid = (l + r) / 2;
        if (pos <= mid) {
            updateUtil(l, mid, 2 * idx, pos, val);
        } else {
            updateUtil(mid + 1, r, 2 * idx + 1, pos, val);
        }
        tree[idx] = tree[2 * idx] + tree[2 * idx + 1];
    }

    public long query(int ql, int qr) {
        return queryUtil(0, n - 1, 1, ql, qr);
    }

    private long queryUtil(int l, int r, int idx, int ql, int qr) {
        if (qr < l || r < ql) return 0;
        if (ql <= l && r <= qr) return tree[idx];
        int mid = (l + r) / 2;
        return queryUtil(l, mid, 2 * idx, ql, qr) + queryUtil(mid + 1, r, 2 * idx + 1, ql, qr);
    }
}
