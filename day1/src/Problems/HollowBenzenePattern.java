package Problems;
import java.util.*;
public class HollowBenzenePattern {
	 public static void main(String[] args){
	        // Benzene shape is typically hexagonal; this is an approximate representation
		 Scanner scanner = new Scanner(System.in);
		 System.out.print("Enter the No.of lines to create a Hollow Benzene Pattern: ");
		 int inputNumber = scanner.nextInt();
	     int space = inputNumber - 1;

	        // Upper part
	     for(int i = 0; i < inputNumber; i++) {
	         for(int j = 0; j < space; j++) {
	             System.out.print(" ");
	         }
	         System.out.print("*");
	         if(i != 0) {
	            for(int j = 0; j < 2 * i - 1; j++) {
	                System.out.print(" ");
	            }
	            System.out.print("*");
	         }
	         System.out.println();
	         space--;
	     }

	        // Lower part
	     space = 1;
	     for(int i = inputNumber - 2; i >= 0; i--) {
	         for(int j = 0; j < space; j++) {
	            System.out.print(" ");
	         }
	         System.out.print("*");
	         if(i != 0) {
	            for(int j = 0; j < 2 * i - 1; j++) {
	               System.out.print(" ");
	            }
	            System.out.print("*");
	         }
	         System.out.println();
	         space++;
	    }
	    scanner.close();
	}
}
