public class BinarySearchWithStrings {
    static int findBook(String[] books, int start, int end, String target) {

        System.out.println("Start: " + start + " - End: " + end + " - Target: " + target);

        if (start > end)
            return -1;

        int mid = start + (end - start) / 2;

        System.out.println("Current book: " + books[mid]);
        if (books[mid].equals(target))
            return mid; // Book found

        if (books[mid].compareTo(target) < 0)
            return findBook(books, mid + 1, end, target);

        return findBook(books, start, mid - 1, target);
    }

    public static void main(String[] args) {
        String[] library = { "Alice in Wonderland", "Moby Dick", "The Great Gatsby", "War and Peace" };
        String bookToFind = "The Great Gatsby"; // Book we want to find
        int result = findBook(library, 0, library.length - 1, bookToFind);
        System.out.println("The book '" + bookToFind + "' is at index: " + result);
    }
}
