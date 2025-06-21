package day7;

import java.util.Scanner;

public class BubbleSort {
	private int size;
	private int[] array;
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
	public static void bubbleSort(BubbleSort obj) {
		for(int i = 0 ;i < obj.size;i++) {
			boolean swapped = false;
			for(int j = 0;j < obj.size-i-1;j++) {
				if(obj.array[j] > obj.array[j+1]) {
					int temp = obj.array[j];
					obj.array[j] = obj.array[j+1];
					obj.array[j+1] = temp;
					swapped = true;
				}
			}
			if(!swapped) {
				break;
			}
		}
		System.out.println("Sorted Array: ");
		for(int i : obj.array) {
			System.out.print(i + " ");
		}
	}
	public static void main(String[] args) {
		Scanner scanner  = new Scanner(System.in);
		BubbleSort obj = new BubbleSort();
		System.out.print("Enter the Size of the Array: ");
		obj.size = scanner.nextInt();
		System.out.print("Enter the Elements into the Array:");
		obj.array = new int[obj.size];
		for(int i = 0;i < obj.size;i++) {
			obj.array[i] = scanner.nextInt();
		}
		bubbleSort(obj);
		scanner.close();
	}
}
