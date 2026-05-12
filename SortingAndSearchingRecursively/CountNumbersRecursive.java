public class CountNumbersRecursive {
   static int countDigits(int number) {
        // Base case: if number is less than 10, it's a single-digit number
        if (number < 10) {
            return 1;
        } else {
            // Recursive case: chop off one digit and count the rest
            return 1 + countDigits(number / 10);
        }
    }

    public static void main(String[] args) {
        System.out.println("Number of digits in 1234: " + countDigits(1234)); // Should print 4
    }
}
