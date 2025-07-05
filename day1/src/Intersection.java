
import java.util.*;
public class Intersection{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); scanner.nextLine();
        String secondLine = scanner.nextLine();
        int m = scanner.nextInt(); scanner.nextLine();
        String fourthLine = scanner.nextLine();
        List<Integer> fisrtArr = new ArrayList<>(n);
        Set<Integer> set = new HashSet<>();
        for(String e : secondLine.trim().split(" ")){
            fisrtArr.add(Integer.parseInt(e));// 4 9 5
            set.add(Integer.parseInt(e));// 4 9 5
        }
        List<Integer> secondArr = new ArrayList<>(m);
        Set<Integer> result = new HashSet<>();
        for(String e : fourthLine.trim().split(" ")){
            secondArr.add(Integer.parseInt(e));// 9 
            if(set.contains(Integer.parseInt(e))){//
                result.add(Integer.parseInt(e));
            }
        }
        for(int num: result){
            System.out.print(num + " ");
        }
        scanner.close();
    }
}
