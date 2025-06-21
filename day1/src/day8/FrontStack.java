package day8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FrontStack {
	private int stackPtr;
	List <Person> stack;
	
	{
		stackPtr = -1;
		stack = new ArrayList<>();
	}
	
	public void push(Person person) {
		stack.add(person);
		stackPtr++;
	}
	
	public Person pop() {
		if(stackPtr == -1) { // check if the stack is empty
			System.out.println("Stack is empty");
			return null; // to say that no element of the stack was popped
		}
		Person person = stack.get(stackPtr); // copy last ele in list
		stack.remove(stackPtr); // delete last ele from list
		stackPtr--;
		return person; // return the popped element from the stack
	}
	
	public void frontPush(Person person) {
		stack.add(0,person);
		stackPtr++;
	}
	public void displayStack() {
		if(stack.isEmpty()) {
			System.out.println("Stack is empty");
			return;
		}
		System.out.printf("%-5s %s", "ID", "NAME");
		System.out.println("\n------------------");
		for(int i = stack.size()-1; i >= 0; i--) {
			Person person = stack.get(i);
			int id = person.getId();
			String name = person.getName();
			System.out.printf("%-5d %s\n", id, name);
		}
		System.out.println();
	}
	public void displayStackFromFront() {
		if(stack.isEmpty()) {
			System.out.println("Stack is empty");
			return;
		}
		System.out.printf("%-5s %s", "ID", "NAME");
		System.out.println("\n------------------");
		for(int i = 0; i < stack.size(); i++) {
			Person person = stack.get(i);
			int id = person.getId();
			String name = person.getName();
			System.out.printf("%-5d %s\n", id, name);
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		FrontStack frontStack = new FrontStack();
		int choice = 0;
		int numberOfOperations = 10;
		do {
			System.out.print("1:Push 2:Pop 3:DisplayStack 4:Push Data from the front 5.DisplayStack from front 6:Exit. \t Your choice? ");
		choice = scanner.nextInt();
		switch(choice) {
		case 1 : 
			System.out.println("Enter Id and Name of the Person:");
			int id = scanner.nextInt();
			String name = scanner.next();
			frontStack.push(new Person(id, name));
			break;
		case 2 :
			Person person = frontStack.pop();
			if(person != null)
				System.out.println("Popped Person is " + person);
			break;
		case 3 :
			frontStack.displayStack();
			break;
		case 4:
			System.out.println("Enter Id and Name of the Person to push from front:");
			int id1 = scanner.nextInt();
			String name2 = scanner.next();
			frontStack.frontPush(new Person(id1, name2));
			break;
		case 5 :
			frontStack.displayStackFromFront();
			break;
		case 6 :
			frontStack.stack = null;
			numberOfOperations = 0;
			break;
		default:
			System.out.println("Invalid choice enetered");
		}
		numberOfOperations--;
		}while(numberOfOperations >= 0);
		System.out.println("End of Program");
		scanner.close();
	}
}
