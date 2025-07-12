//package Learning Process.Step 5;
import java.util.*;
public class LongestWord {
    public static void longestWord(String[] words){
        int max = words[0].length();
        String large  = words[0];
        for(int i = 1;i < words.length;i++){
            if(words[i].length() > max){
                max = words[i].length();
                large = words[i];
            }
        }
        System.out.println("The Largest Word in the sentence is " + large + "with size: " + max);
    }
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the Sentence: ");
        String line = obj.nextLine().trim();
        if(line.isEmpty()){
            System.out.println("There are no words!");
        }
        else{
            String[] words = line.split("\\s+");
            longestWord(words);
        }
        obj.close();
    }
}
