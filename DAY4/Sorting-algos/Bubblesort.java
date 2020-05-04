package DAY4;

import java.util.Arrays;
import java.util.Scanner;

public class Bubblesort {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int array[] = new int[size];
		for (int i = 0; i < array.length; i++) {
			array[i] = in.nextInt();
		}
		sort(array);
		print(array);
	}
}
