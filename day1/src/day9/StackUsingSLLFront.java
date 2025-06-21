package day9;

public class StackUsingSLLFront {
	public static void runMenu() {
		int choice = 0;
		int numberOfOperations = 20;
		SinglyList list = new SinglyList();
		do {
			System.out.print("\n1:InsertFront 2:DeleteFront 3:Display 4:Exit.  Your Choice: ");
			choice = SinglyList.scanner.nextInt();
			switch(choice) {
			case 1 : list.insertAtFront(); break;
			case 2 : list.deleteFromFront(); break;
			case 3 : list.displayFromRear(); break;
			case 4 : numberOfOperations = 0; break;
			default: System.out.println("Invalid Choice");
			}
			numberOfOperations--;
		}while(numberOfOperations >= 1);
	}
	
	public static void main(String[] args) {
		runMenu();
		System.out.println("End of Program");
	}
}
