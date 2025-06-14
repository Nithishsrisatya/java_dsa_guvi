/*
 * The teacher has evaluated all the exam papers of the student Sushma. Help the coordinator 
   to write/declare the exam result depending on the average marks. The coordinator gets the 
   average marks from the teacher. The coordinator must check if the average score is valid 
   or not. Any average score which is not mentioned in the below table is invalid.

0  to  59		Fail
60 to 80		Second class
81 to 95		First class
96 to 100		Outstanding
 */
package day1;
import java.util.Scanner;
public class ExamResult {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		float averageScore = 0.0f;
		System.out.print("Enter the Average Score of the Student: ");
		averageScore = scanner.nextFloat();
		System.out.println("-------------------------------------------");
		if(averageScore >= 0 && averageScore <= 59) {
			System.out.println("This Student is Failed ");
		}
		else if (averageScore <= 80) {
			System.out.println("This Student is Passed in Second Class");
		}
		else if (averageScore <= 95) {
			System.out.println("This Student is Passed in First Class");
		}
		else if (averageScore <= 100) {
			System.out.println("This Student is Outstanding One");
		}
		else {
			System.out.println("Invalid Score Entered !");
		}
		scanner.close();
	}
}
