package day7;

import java.util.Scanner;

public class BinarySearch {
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
	public static void search(BinarySearch obj) {
		int low = 0;
		int high = obj.size-1;
		while(low < high) {
			int mid = (low + high)/2;
			if(obj.array[mid] == obj.searchElement) {
				System.out.println("Element fount at the position: " + mid);
				break;
			}
			else if(obj.array[mid] > obj.searchElement) {
				low = mid + 1;
			}
			else {
				high = mid - 1;
			}
		}
	}
	public static void main(String[] args) {
		Scanner scanner  = new Scanner(System.in);
		BinarySearch obj = new BinarySearch();
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
