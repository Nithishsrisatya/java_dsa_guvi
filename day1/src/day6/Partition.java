package day6;
import java.util.Arrays;
import java.util.Scanner;
public class Partition {
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
	public static void partitionArry(Partition obj) {
		int pivot = obj.array[obj.sizeOfArray - 1];
		int i = -1;
		for (int j = 0; j < obj.sizeOfArray - 1; j++) {
			if (obj.array[j] < pivot) {
				i++;
				int temp = obj.array[i];
				obj.array[i] = obj.array[j];
				obj.array[j] = temp;
			}
		}
		int temp = obj.array[i + 1];
		obj.array[i + 1] = obj.array[obj.sizeOfArray - 1];
		obj.array[obj.sizeOfArray - 1] = temp;
	}
	public static void main(String[] args) {
		Partition obj = new Partition();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		obj.sizeOfArray = scanner.nextInt();
		obj.array = new int[obj.sizeOfArray];
		System.out.println("Enter " + obj.sizeOfArray + " elements: ");
		for (int i = 0; i < obj.sizeOfArray; i++) {
			obj.array[i] = scanner.nextInt();
		}
		System.out.println("The input array is: " + Arrays.toString(obj.array));
		partitionArry(obj);
		System.out.println("The array after one partition step is: " + Arrays.toString(obj.array));
		scanner.close();
	}
}
