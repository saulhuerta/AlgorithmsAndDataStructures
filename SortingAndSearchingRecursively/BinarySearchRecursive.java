public class BinarySearchRecursive {

	// Recursive method to perform binary search
	public static int binarySearch(int[] arr, int start, int end, int target) {
		if (start > end)
			return -1; // Base case
		int mid = start + (end - start) / 2; // Find the midpoint
		if (arr[mid] == target)
			return mid; // Target found
		if (arr[mid] > target) // If the target is less than the midpoint
			return binarySearch(arr, start, mid - 1, target); // Search the left half
		return binarySearch(arr, mid + 1, end, target); // Search the right half
	}

	public static void main(String[] args) {
		int[] sortedArray = { 1, 3, 5, 7, 9, 11 };
		int target = 5;

		int result = binarySearch(sortedArray, 0, sortedArray.length - 1, target);

		if (result != -1) {
			System.out.println("Target " + target + " found at index: " + result);
		} else {
			System.out.println("Target " + target + " not found in the array.");
		}
	}
}
