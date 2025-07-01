import java.util.*;
public class GeneratePermutation {
    public static void generatePermutation(String input,String result){
        if(input.length() == 0){
            System.out.println(result);
            return;
        }
        for(int i = 0; i < input.length();i++){
            char ch = input.charAt(i);
            String newInput = input.substring(0,i) + input.substring(i+1);
            generatePermutation(newInput,result + ch);
        }
    }
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        String input = obj.nextLine();
        generatePermutation(input,"");
        obj.close();
    }
}
