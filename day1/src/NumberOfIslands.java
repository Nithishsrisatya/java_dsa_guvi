/* 
 * 08
"Number of Islands", "Given a 2D grid of '1's (land) and '0's (water), count the number of islands using DFS or BFS.", "Medium", "LeetCode, Amazon"
----------------------------------
Problem Title:
Number of Islands

Problem Description:
Given a 2D grid map of '1's (land) and '0's (water), count the number of islands. An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are surrounded by water.

Input Format:
- The first line contains two integers, m and n, representing the number of rows and columns of the grid.
- The next m lines each contain a string of length n, consisting of '0's and '1's, representing the grid.

Output Format:
- A single integer representing the number of islands in the grid.

Constraints:
- 1 <= m, n <= 300
- grid[i][j] is either '0' or '1'

Sample Input:
4 5
11000
11000
00100
00011

Sample Output:
3

Explanation:
There are three islands:
- The first island is formed by the group of '1's at the top left.
- The second island is the single '1' in the middle.
- The third island is the two '1's at the bottom right.

Difficulty:
Medium

Five Test Cases:
Test Case 1:
Input:
3 3
111
010
111
Output:
1

Test Case 2:
Input:
3 3
110
010
011
Output:
2

Test Case 3:
Input:
2 2
00
00
Output:
0

Test Case 4:
Input:
1 5
10101
Output:
3

Test Case 5:
Input:
5 1
1
0
1
0
1
Output:
3
----------------------------------

 */
import java.util.*;
public class NumberOfIslands {
    static int rows;
    static int col;
    static char[][] arr;
    static boolean[][] visited;
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);

        rows = obj.nextInt();
        col = obj.nextInt();
        arr = new char[rows][col];
        obj.nextLine(); 
        for(int i=0;i < rows;i++){
            String line = obj.nextLine();
            for(int j=0;j < col;j++){
                arr[i][j] = line.charAt(j);
            }
        }
        
        visited = new boolean[rows][col];
        for(int i = 0;i < rows;i++){
            for(int j = 0;j < col;j++){
                visited[i][j] = false;
            }
        }
        int result = numberIslands();
        System.out.println(result);
        obj.close();
    }
    static int numberIslands(){
        if(arr == null || rows == 0 || col == 0){
            return 0;
        }
        if(rows == 1 && col == 1){
            return arr[0][0] == '1' ? 1 : 0;
        }

        int count = 0;
        for(int i = 0;i < rows;i++){
            for(int j = 0;j < col;j++){
                if(arr[i][j] == '1' & !visited[i][j]){
                    count++;
                    dfs(i,j);
                }
            }
        }
        return count;
    }
    static void dfs(int i, int j){
        if(i < 0 || i >= rows || j < 0 || j >= col || arr[i][j] != '1' || visited[i][j]){
            return;
        }
        visited[i][j] = true;
        dfs(i - 1,j);
        dfs(i + 1,j);
        dfs(i,j - 1);
        dfs(i,j + 1);
    }
}
