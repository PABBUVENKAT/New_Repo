package SearchingAndSorting;

public class Quick_Sort {
	static void swap(int[] arr, int i, int j) // A utility function to swap two elements
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	/*
	 * This function takes last element as pivot, places the pivot element at its
	 * correct position in sorted array, and places all smaller (smaller than pivot)
	 * to left of pivot and all greater elements to right of pivot
	 */
	static int partition(int[] arr, int low, int high) {
		int pivot = arr[high];
		int i = (low - 1);
		for (int j = low; j <= high - 1; j++) {
			if (arr[j] < pivot) { // If current element is smaller than the pivot.
				i++; // Increment index of smaller element
				swap(arr, i, j);
			}
		}
		swap(arr, i + 1, high);
		return (i + 1);
	}

	// The main function that implements QuickSort arr[] --> Array to be sorted,low
	// --> Starting index,high --> Ending index
	static void quickSort(int[] arr, int low, int high) {
		if (low < high) {
			int pi = partition(arr, low, high); // pi is partitioning index, arr[p] is now at right place
			quickSort(arr, low, pi - 1); // Separately sort elements before partition and after partition
			quickSort(arr, pi + 1, high);
		}
	}

	static void printArray(int[] arr, int size) // this function is used to print the array(Function to print an array)
	{
		for (int i = 0; i < size; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	public static void main(String[] args) // this method is used for drive the code (Driver Code)
	{
		int[] arr = { 10, 60, 30, 80, 40, 70 };
		int n = arr.length;
		quickSort(arr, 0, n - 1);
		System.out.println("Sorted array: ");
		printArray(arr, n);
	}
}