/* 
 * 09
"Permutations of a String", 
"Generate all possible permutations of a given string 
 using recursion and backtracking.", 
"Easy", 
"HackerRank, Google"
----------------------------------

Problem Title: Permutations of a String

Problem Description:
    Given a string S, 
    generate all possible permutations of the characters 
    in the string using recursion and backtracking. 
    
    Each permutation should be unique. 
    
    Print the permutations in lexicographical order.

Input Format:
    - A single line containing the string S.

Output Format:
    - Each line contains one permutation of the string S.

Constraints:
    - 1 ≤ length of S ≤ 8
    - S consists of lowercase English letters only.

Sample Input:
abc

Sample Output:
abc
acb
bac
bca
cab
cba

Explanation:
All possible unique permutations of the string "abc" are printed 
in lexicographical order.

Difficulty:
Easy

Test Cases:
1.
Input:
aab

Output:
aab
aba
baa

2.
Input:
xyz

Output:
xyz
xzy
yxz
yzx
zxy
zyx

3.
Input:
a

Output:
a

4.
Input:
abb

Output:
abb
bab
bba

5.
Input:
abcd

Output:
abcd
abdc
acbd
acdb
adbc
adcb
bacd
badc
bcad
bcda
bdac
bdca
cabd
cadb
cbad
cbda
cdab
cdba
dabc
dacb
dbac
dbca
dcab
dcba
 */
public class PerimutationAndBacktrackingaString {
    public static void permute(String str, String ans) {
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }
        
        boolean[] visited = new boolean[26]; // To track visited characters
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!visited[ch - 'a']) { // Check if character is already used
                visited[ch - 'a'] = true; // Mark character as used
                String ros = str.substring(0, i) + str.substring(i + 1); // Remaining string
                permute(ros, ans + ch); // Recur with remaining string and current character added to answer
            }
        }
    }

    public static void main(String[] args) {
        String input = "abc"; // Example input
        permute(input, "");
    }
}
