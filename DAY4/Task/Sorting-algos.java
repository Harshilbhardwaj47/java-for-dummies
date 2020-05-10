import java.util.Scanner;
import java.util.Arrays;

public class Sorting{
	public static void main(String[] args)
	{
		Scanner scan= new Scanner(System.in);
		int size = scan.nextInt();
		int array[] = new int[size];
		for(inti=0; i<array.length; i++)
		{
			array[i]=scan.nextInt();
		}
		int choice = scan.nextInt();
		switch(choice)   //Switch case for choosing from 3 options
		{
			case 1: Insertionsort(array);
				break;
			case 2: Bubblesort(array);
				break;
			case 3: Mergesort(array);
				break;
			default: System.out.println("Invalid choice");
		}
	}
public static void Insertionsort(int array[]) //function for insertion sort
	{
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
public static void Bubblesort(int array[])  //function for bubble sort
	{
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
