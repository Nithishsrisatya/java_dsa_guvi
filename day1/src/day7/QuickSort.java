package day7;
import java.util.Arrays;
import java.util.Scanner;
public class QuickSort {
	private int sizeOfArray;
	private int[] array; 

	public int getSizeOfArray() {
		return sizeOfArray;
	}
	public void setSizeOfArray(int sizeOfArray) {
		this.sizeOfArray = sizeOfArray;
	}
	public int[] getArray() {
		return array;
	}
	public void setArray(int[] array) {
		this.array = array;
	}
	public static void quickSort(QuickSort obj, int low, int high) {
		if (low < high) {
            int pi = partitionArray(obj, low, high);
            quickSort(obj, low, pi - 1);  
            quickSort(obj, pi + 1, high);
        }
	}
	public static int partitionArray(QuickSort obj, int low, int high) {
		int pivot = obj.array[high];
		int i = low - 1;
		for (int j = low; j < high; j++) {
			if (obj.array[j] < pivot) {
				i++;
				int temp = obj.array[i];
				obj.array[i] = obj.array[j];
				obj.array[j] = temp;
			}
		}
		int temp = obj.array[i + 1];
		obj.array[i + 1] = obj.array[high];
		obj.array[high] = temp;
		return i + 1;
	}
	public static void main(String[] args) {
		QuickSort obj = new QuickSort();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		obj.sizeOfArray = scanner.nextInt();
		obj.array = new int[obj.sizeOfArray];
		System.out.println("Enter " + obj.sizeOfArray + " elements: ");
		for (int i = 0; i < obj.sizeOfArray; i++) {
			obj.array[i] = scanner.nextInt();
		}
		System.out.println("The input array is: " + Arrays.toString(obj.array));
		quickSort(obj, 0, obj.sizeOfArray - 1);
		System.out.println("The array after one partition step is: " + Arrays.toString(obj.array));
		scanner.close();
	}
}
