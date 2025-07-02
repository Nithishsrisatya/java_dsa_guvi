import java.util.Scanner;
public class EvenOrOdd{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = obj.nextInt();
        if(num % 2 == 0){
            System.out.println("Given " + num + " is Even");
        }
        else{
            System.out.println("Given number " + num + " is Odd");
        }
        obj.close();
    }
}