package DAY4;

import java.util.Arrays;
import java.util.Scanner;

public class Insertionsort {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);// As usual called the scanner class
		int size = in.nextInt();// used the object created from the scanner class
		int array[] = new int[size];// initialized the array size
		for (int i = 0; i < array.length; i++) {
			array[i] = in.nextInt();// taken values inside the array
		}
		sort(array);// this function will sort the array
		printarray(array);// this function will print the sorted array
	}
}
