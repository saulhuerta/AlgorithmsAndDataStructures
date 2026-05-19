public class BinarySearchInDecreasingOrder {

	public static void main(String[] args) {
		int[] nums = new int[] { 4, 3, 2, 1, 7, 6, 5 };
		System.out.println("Max: " + findMax(nums)); // Output: 7

		int[] nums2 = new int[] { 3, 2, 1 };
		System.out.println("Max: " + findMax(nums2)); // Output: 3

		int[] nums3 = new int[] { 6, 5, 4, 3, 2, 1, 7 };
		System.out.println("Max: " + findMax(nums3)); // Output: 7
	}

	public static int findMax(int[] nums) {
		int left = 0, right = nums.length - 1;

		while (nums[left] < nums[right]) {
			int mid = left + (right - left) / 2;
			System.out.println("================================================");
			System.out.println("Left(" + left + "):" + nums[left] + " Right(" + right + "):" + nums[right] + " Mid("
					+ mid + "):" + nums[mid]);

			if (nums[mid] < nums[right]) {
				left = mid + 1;
			} else {
				right = mid;
			}
		}

		return nums[left];
	}
}
