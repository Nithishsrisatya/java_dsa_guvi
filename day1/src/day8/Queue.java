package day8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Person1 {
	private int id;
	private  String name;
	public Person1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person1(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
	    return "Person [id=" + id + ", name=" + name + "]";
	}

}




public class Queue {
	
	private static int rear;
	private int front;
	static List <Person1> queue;
	
	{
		setFront(0);
		setRear(0);
		queue = new ArrayList<>();
	}
	public static int getRear() {
		return rear;
	}

	public static void setRear(int rear) {
		Queue.rear = rear;
	}

	public int getFront() {
		return front;
	}

	public void setFront(int front) {
		this.front = front;
	}
	public static void enque(Person1 person) {
		queue.add(person);
		setRear(getRear() + 1);
	}
	
	public static Person1 deque() {
		if(queue.isEmpty()) {
		System.out.println("Queue is Empty");
		return null;
		
		}
		Person1 person = queue.get(0);
		queue.remove(0);
		return person;
	}
	
	public static void displayQueue() {
		if(queue.isEmpty()) {
			System.out.println("Queue is empty");
			return;
		}
		System.out.printf("%-5s %s", "ID", "NAME");
		System.out.println("\n------------------");
		for(int i = 0; i <queue.size(); i++) {
			Person1 person = queue.get(i);
			int id = person.getId();
			String name = person.getName();
			System.out.printf("%-5d %s\n", id, name);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//Queue personQueue = new Queue();
		int choice = 0;
		int numberOfOperations = 10;
		do {
			System.out.print("1:Enqueue 2:Dequeue 3:DisplayQueue 4:Exit. \t Your choice? ");
		choice = scanner.nextInt();
		switch(choice) {
		case 1 : 
			System.out.println("Enter Id and Name of the Person:");
			int id = scanner.nextInt();
			String name = scanner.next();
			Queue.enque(new Person1(id, name));
			break;
		case 2 :
			Person1 person = Queue.deque();
			if(person != null)
				System.out.println("Popped Person is " + person);
			break;
		case 3 :
			Queue.displayQueue();
			break;
		case 4 :
			Queue.queue = null;
			numberOfOperations = 0;
			break;
		default:
			System.out.println("Invalid choice enetered");
		}
		numberOfOperations--;
		}while(numberOfOperations >= 0);
		System.out.println("End of Program");
		scanner.close();
	}
}
