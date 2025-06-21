package day7;

import java.util.Scanner;

public class LinearSearch {
	private int size;
	private int[] array;
	private int searchElement;
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public int[] getArray() {
		return array;
	}
	public void setArray(int[] array) {
		this.array = array;
	}
	public int getSearchElement() {
		return searchElement;
	}
	public void setSearchElement(int searchElement) {
		this.searchElement = searchElement;
	}
	public static void search(LinearSearch obj) {
		for(int i = 0 ;i < obj.size;i++) {
			if(obj.array[i] == obj.searchElement) {
				System.out.println("Element found at the position: " + i );
				break;
			}
		}
	}
	public static void main(String[] args) {
		Scanner scanner  = new Scanner(System.in);
		LinearSearch obj = new LinearSearch();
		System.out.print("Enter the Size of the Array: ");
		obj.size = scanner.nextInt();
		System.out.print("Enter the Elements into the Array:");
		obj.array = new int[obj.size];
		for(int i = 0;i < obj.size;i++) {
			obj.array[i] = scanner.nextInt();
		}
		System.out.print("Enter the Search Element: ");
		obj.searchElement = scanner.nextInt();
		search(obj);
		scanner.close();
	}
}
