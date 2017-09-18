package IT391.Sieglaff.unit4;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment5 {

	public static void main(String[] args) {
		int[] partNumbers = {1065, 1095, 1075, 1055, 1056, 1090, 1098, 1088, 1097, 1078};
		Arrays.sort(partNumbers);
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a part number to search for: ");
		int search = input.nextInt();
		int low = 0;
		int high = partNumbers.length-1;
		
		binarySearch(partNumbers, low, high, search);
		
		System.out.println("Please enter a second part number to search for: ");
		search = input.nextInt();
		low=0;
		high = partNumbers.length-1;
		
		binarySearch(partNumbers, low, high, search);
		
		input.close();
	}

	private static void binarySearch(int[] x, int first, int last, int key) {
		int middle = (first+last)/2;
		
		while(first<=last) {
			if(x[middle]<key) {
				first = middle + 1;
			}
			else if (x[middle] == key) {
				System.out.printf("The part number was found at index %d\n", middle);
				System.out.printf("%d is in stock\n", key);
				break;
			}
			else
				last = middle -1;
			
			middle = (first + last)/2;
		}
		
		if(first>last)
			System.out.printf("%d is not in stock\n", key);
	}

}
