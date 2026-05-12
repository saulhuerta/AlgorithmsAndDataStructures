public class SumAllDigitsRecursive {

    // Recursive method to calculate the sum of digits of a number
    static int countStars(int number) {
        if(number == 0) 
            return 0; // Base case: if number is 0, stop recursion
        
        return (number % 10) + countStars(number / 10);
    }

    public static void main(String[] args) {
        System.out.println(countStars(4042)); // Will print the sum of digits of the star code 4042
    }

}
