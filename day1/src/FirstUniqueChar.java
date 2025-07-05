
import java.util.*;
public class FirstUniqueChar {
    private static int findFirst(String str){
        Map<Character, Integer> dict = new HashMap<>();
        for(int i = 0;i < str.length();i++){
            int count = dict.computeIfAbsent(str.charAt(i), e -> 0) + 1;
            dict.put(str.charAt(i),count);
        }
        for(int i = 0;i < str.length();i++){
            if(dict.get(str.charAt(i)) == 1){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(findFirst(str));
        scanner.close();
    }
}
