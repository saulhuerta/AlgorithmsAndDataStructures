public class QuickSort {
	static int partitionCelestial(int[] magnitudes, int start, int end) {
		int pivot = magnitudes[end];
		int i = start - 1;

		System.out.println("\nPivot:" + pivot);

		for (int j = start; j < end; j++) {
			System.out.println("\n=========================");
			System.out.print("Items: ");
			for (int item : magnitudes)
				System.out.print(item + " ");

			System.out.println("\ni:" + i);
			System.out.println("j:" + j);
			System.out.println("\nif (magnitudes[j] < pivot)");
			System.out.println("if (" + magnitudes[j] + " < " + pivot + ")");

			if (magnitudes[j] < pivot) {
				i++;

				int temp = magnitudes[i];
				magnitudes[i] = magnitudes[j];
				magnitudes[j] = temp;
			}

			System.out.print("Items: ");
			for (int item : magnitudes)
				System.out.print(item + " ");

			System.out.println("\n=========================");
		}

		int temp = magnitudes[i + 1];
		magnitudes[i + 1] = magnitudes[end];
		magnitudes[end] = temp;

		return i + 1;
	}

	public static void main(String[] args) {
		int[] celestialMagnitudes = { 5, 3, 0, -1, -2, 1 };

		System.out.print("Items: ");
		for (int item : celestialMagnitudes)
			System.out.print(item + " ");

		int pivotPosition = partitionCelestial(celestialMagnitudes, 0, celestialMagnitudes.length - 1);
		// Now, celestialMagnitudes is partitioned, with pivot in the correct position.

		System.out.println("\nPivot Index: " + pivotPosition);
		System.out.print("Items: ");
		for (int item : celestialMagnitudes)
			System.out.print(item + " ");

	}

}
