package day6;

import java.util.Scanner;

public class EmployeeConnection {
	private int size;
	private int[] systems;
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public int[] getSystems() {
		return systems;
	}
	public void setSystems(int[] systems) {
		this.systems = systems;
	}
	public static void count(EmployeeConnection obj) {
		int zeros = 0;
		for(int i = 0;i < obj.size;i++) {
			if(obj.systems[i] == 0) {
				zeros++;
			}
		}
		System.out.println("No.of Connection required: " + zeros);
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		EmployeeConnection obj = new EmployeeConnection();
		System.out.print("Enter No.of Systems: ");
		obj.size = scanner.nextInt();
		System.out.print("Enter that which System have connection(1). If not(0): ");
		obj.systems = new int[obj.size];
		for(int i = 0;i < obj.size;i++) {
			obj.systems[i] = scanner.nextInt();
		}
		count(obj);
		scanner.close();
	}
}
