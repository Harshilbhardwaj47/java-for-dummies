package DAY4;

import java.util.Arrays;
import java.util.Scanner;

public class Mergesort {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int array[] = new int[size];
		for (int i = 0; i < array.length; i++) {
			array[i] = in.nextInt();
		}
		Mergesort ob = new Mergesort();
		ob.sort(array, 0, array.length - 1);
		print(array);
	}
}

