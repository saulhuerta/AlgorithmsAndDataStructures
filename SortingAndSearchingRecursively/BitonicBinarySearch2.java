public class BitonicBinarySearch2 {

    public static int findPosition(int arr[], int x) {
        System.out.println("findPosition()");
        System.out.println("Number to locate: " + x);
        
        int mid = findPeak(arr);
        
        System.out.println("Peak: " + mid);
        
        int searchResult = binarySearch(arr, x, 0, mid, true);
        
        System.out.println("Search Result: " + searchResult);
        
        if (searchResult != -1) {
            return searchResult;
        } else {
            return binarySearch(arr, x, mid, arr.length - 1, false);
        }
    }

    static int findPeak(int arr[]) {
        
        System.out.println("");
        System.out.println("findPeak():");
        
        int low = 0, high = arr.length - 1;

        while( low < high) {
            int mid = low + (high - low) / 2;
            
            if (arr[mid] > arr[mid + 1]) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        
        return low;
    }

    static int binarySearch(int arr[], int x, int low, int high, boolean ascending) {
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == x) {
                return mid;
            } 
            if (ascending) {
                if (arr[mid] < x) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            } else {
                 if (arr[mid] > x) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {-3, -2, 4, 6, 10, 8, 7, 1};
        int x = 7;
        int position = findPosition(arr, x);
        if (position == -1) {
            System.out.println("Element Not Present");
        } else {
            System.out.println("Element Present at Index " + position);
        }
    }
    
}
