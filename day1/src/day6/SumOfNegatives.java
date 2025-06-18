package day6;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfNegatives {
	private int numberOfShoes;
	private int buyShoes;
	private int[] pricesOfShoes;
	private int sum;
	public int getNumberOfShoes() {
		return numberOfShoes;
	}
	public void setNumberOfShoes(int numberOfShoes) {
		this.numberOfShoes = numberOfShoes;
	}
	public int getBuyShoes() {
		return buyShoes;
	}
	public void setBuyShoes(int buyShoes) {
		this.buyShoes = buyShoes;
	}
	public static void shoesBuy(SumOfNegatives obj) {
		Arrays.sort(obj.pricesOfShoes);
		int count = 0;
		for(int i = 0; i < obj.numberOfShoes && count < obj.buyShoes;i++) {
			if(obj.pricesOfShoes[i] < 0) {
				obj.sum += -obj.pricesOfShoes[i];
				count++;
			}
			else {
				break;
			}
		}
		System.out.println("No.of Shoes they can buy from the Mall: " + obj.sum);
	}
	public static  void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		SumOfNegatives obj = new SumOfNegatives();
		System.out.println("Enter Number of Shoes int the mall: ");
		obj.numberOfShoes = scanner.nextInt();
		System.out.println("Enter NO.of Shoes they can Buy: ");
		obj.buyShoes = scanner.nextInt();
		obj.pricesOfShoes = new int[obj.numberOfShoes];
		System.out.print("Enter the Prices of Shoes: ");
		for(int i = 0;i < obj.numberOfShoes;i++) {
			obj.pricesOfShoes[i] = scanner.nextInt();
		}
		shoesBuy(obj);
		scanner.close();
	}
}
