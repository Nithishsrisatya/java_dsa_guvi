import java.util.*;
public class RemoveDuplicatesGeneratePermutation {
    public static void generatePermutation(char[] input,boolean[] visited,StringBuilder result){
        if(result.length() == input.length){
            System.out.println(result.toString());
            return;
        }
        for(int i = 0;i < input.length;i++){
            if(visited[i]) continue;
            if(i > 0 && input[i] == input[i - 1] && ! visited[ i - 1 ])continue;
            visited[i] = true;
            result.append(input[i]);
            generatePermutation(input, visited, result);
            result.deleteCharAt(result.length() - 1);
            visited[i] = false;
        }
    }
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        String input = obj.nextLine();
        char[] chars = input.toCharArray();
        Arrays.sort(chars);
        boolean[] visited = new boolean[chars.length];
        StringBuilder result = new StringBuilder();
        generatePermutation(chars,visited,result);
        obj.close();
    }
}
