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
import java.util.Arrays;
 
public class PermutationAndBacktrackingString {
    public static void permute(String str, String ans, boolean[] used) {
        if (ans.length() == str.length()) {
            System.out.println(ans);
            return;
        }
 
        for (int i = 0; i < str.length(); i++) {
            // Skip already used characters
            if (used[i]) continue;
 
            // Skip duplicates unless it's the first occurrence or previous duplicate was used
            if (i > 0 && str.charAt(i) == str.charAt(i - 1) && !used[i - 1]) continue;
 
            used[i] = true;
            permute(str, ans + str.charAt(i), used);
            used[i] = false; // Backtrack
        }
    }
 
    public static void main(String[] args) {
        String input = "aab";
        char[] chars = input.toCharArray();
        Arrays.sort(chars); // Ensure lexicographical order
        boolean[] used = new boolean[chars.length];
        permute(new String(chars), "", used);
    }
}
