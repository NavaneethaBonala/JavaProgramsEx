package sorting_algorithm;

public class SelectionSort {
	public static void main(String[] args) {
		int[] arr = {64, 34, 25, 12, 22, 11, 90};
		System.out.println("Original Array:");
		printArray(arr);
		// Perform Selection Sort
		selectionSort(arr);
		System.out.println("\nSorted Array:");
		printArray(arr);
	}
	// Function to perform Selection Sort
	public static void selectionSort(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			// Find the minimum element in the unsorted portion
			int minIndex = i;
			for (int j = i + 1; j < n; j++) {
				if (arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			// Swap the found minimum element with the
			// first element of the unsorted portion
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}
	}
	// Utility function to print an array
	public static void printArray(int[] arr) {
		for (int value : arr) {
			System.out.print(value + " ");
		}
		System.out.println();
	}
}
