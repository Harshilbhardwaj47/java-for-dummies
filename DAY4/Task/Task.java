package DAY4;

import java.util.Arrays;
import java.util.Scanner;

public class Task {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = in.nextInt();
		int array[] = new int[size];
		System.out.println("Enter the values in the array");
		for (int i = 0; i < array.length; i++) {
			array[i] = in.nextInt();
		}
		System.out.println("How do you want to sort the array");
		System.out.println("1) Insertion sort");
		System.out.println("2) Merge sort");
		System.out.println("3) Bubble sort");
		int choice = in.nextInt();
		switch (choice) {
		case 1: {
			insertion(array);
			break;
		}
		case 2: {
			Task ob = new Task();
			ob.sort(array, 0, array.length - 1);
			break;
		}
		case 3: {
			bubble(array);
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + choice);
		}
	}

	public static void bubble(int array[]) {
		int n = array.length;
		for (int i = 0; i < n - 1; i++)
			for (int j = 0; j < n - i - 1; j++)
				if (array[j] > array[j + 1]) {
					// swap array[j+1] and array[i]
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
		System.out.println(Arrays.toString(array));
	}

	public static void merge(int array[], int big, int mid, int end) {
		int l = mid - big + 1;
		int r = end - mid;

		int LeftArray[] = new int[l];
		int RightArray[] = new int[r];

		for (int i = 0; i < l; ++i)
			LeftArray[i] = array[big + i];

		for (int j = 0; j < r; ++j)
			RightArray[j] = array[mid + 1 + j];

		int i = 0, j = 0;
		int k = big;
		while (i < l && j < r) {
			if (LeftArray[i] <= RightArray[j]) {
				array[k] = LeftArray[i];
				i++;
			} else {
				array[k] = RightArray[j];
				j++;
			}
			k++;
		}
		while (i < l) {
			array[k] = LeftArray[i];
			i++;
			k++;
		}

		while (j < r) {
			array[k] = RightArray[j];
			j++;
			k++;
		}

	}

	public static void sort(int array[], int big, int end) {
		if (big < end) {
			int mid = (big + end) / 2;
			sort(array, big, mid);
			sort(array, mid + 1, end);
			merge(array, big, mid, end);
			System.out.println(Arrays.toString(array));
		}

	}

	public static void insertion(int array[]) {
		for (int i = 0; i < array.length; ++i) {
			int key = array[i];
			int j = i - 1;

			// now here we are moving the elements one step ahead who are greater than key
			while (j >= 0 && array[j] > key) {
				array[j + 1] = array[j];
				j = j - 1;
			}
			array[j + 1] = key;// and finally we have our sorted array
		}
		System.out.println(Arrays.toString(array));

	}
}

