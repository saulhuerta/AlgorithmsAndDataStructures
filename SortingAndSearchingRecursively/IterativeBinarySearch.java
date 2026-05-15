public class IterativeBinarySearch {
    static int findBook(int[] books, int bookID) {
        int low = 0;
        int high = books.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (books[mid] == bookID)
                return mid; // Book found at mid index.
            if (books[mid] < bookID)
                low = mid + 1; // Search in the right half.
            else
                high = mid - 1; // Search in the left half.
        }
        return -1; // Book not found.
    }

    public static void main(String[] args) {
        int[] bookCatalog = { 1001, 1005, 1010, 1012, 1018, 1023 }; // Sorted array of book IDs
        int bookToFind = 1012;
        int bookPosition = findBook(bookCatalog, bookToFind);
        System.out.println(bookPosition); // Expected output is 3 (0-based index)
    }
}