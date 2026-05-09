package HashMapsExercices;

import java.util.HashMap;

public class BooksHashMap {
    public static void main(String[] args) {
        // TODO: Create a HashMap with String as the key type and String as the value
        // type
        HashMap<String, String> books = new HashMap<>();

        // TODO: Add at least three books to the inventory with their ISBN and name
        books.put("978-1-60309-369-9", "Head First Java ");
        books.put("978-1-60309-517-4", "Java: A Beginner's Guide");
        books.put("978-0-439-02348-1", "Core Java, Volume I: Fundamentals");
        books.put("0-323-77671-X", "Java: The Complete Reference");

        // TODO: Display the entire bookstore inventory
        System.out.println(books);

        // TODO: Remove any book from the inventory
        books.remove("0-323-77671-X");

        // TODO: Display the entire bookstore inventory
        System.out.println(books);
    }
}