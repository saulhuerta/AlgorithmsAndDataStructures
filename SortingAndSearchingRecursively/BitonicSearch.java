public class BitonicSearch {

    public static int findPeak(int[] temperatures) {
        int low = 0, high = temperatures.length - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (temperatures[mid] > temperatures[mid + 1]) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low; // This is the index of the peak temperature.
    }

    public static int binarySearch(int[] temperatures, int low, int high, int targetTemp, boolean ascending) {
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (temperatures[mid] == targetTemp) {
                return mid;
            }
            if (ascending ? temperatures[mid] < targetTemp : temperatures[mid] > targetTemp) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static int searchBitonicArray(int[] temperatures, int targetTemp) {
        int peakIndex = findPeak(temperatures);
        int searchResult = binarySearch(temperatures, 0, peakIndex, targetTemp, true);
        if (searchResult != -1) {
            return searchResult;
        } else {
            return binarySearch(temperatures, peakIndex + 1, temperatures.length - 1, targetTemp, false);
        }
    }
}
