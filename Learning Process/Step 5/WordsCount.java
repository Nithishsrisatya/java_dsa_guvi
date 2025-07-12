//package Learning Process.Step 5;
import java.util.*;
public class WordsCount {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the Sentence: ");
        String line = obj.nextLine().trim();
        if(line.isEmpty()){
            System.out.println("There are no words!");
        }
        else{
            String[] words = line.split("\\s+");
            System.out.println("No.Of words in the Sentence: " + words.length);
        }
        obj.close();
    }
}
