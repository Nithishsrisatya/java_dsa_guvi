import java.util.*;
public class Combinations {
    public static List<List<Integer>> generateCombination(List<Integer> num){
        List<List<Integer>> result = new ArrayList<>();
        generate(num, new ArrayList<>(), result);
        return result;
    }
    public static void generate(List<Integer> org, List<Integer> num, List<List<Integer>> result){
        for(int i : org){
            num.add(i);
            result.add(new ArrayList<>(num));
            org.remove(org.size() - 1);
            generate(org, num, result);
            num.remove(num.size() - 1);
        }
    }
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter  n ");
        int n = obj.nextInt();
        System.out.println("Enter elements : ");
        List<Integer> num = new ArrayList<>();
        for(int i = 0;i < n;i++){
            int input = obj.nextInt();
            num.add(input);
        }
        List<List<Integer>> list = generateCombination(num);
        for(List<Integer> i : list){
            System.out.println(i);
        }
        obj.close();
    }
}
