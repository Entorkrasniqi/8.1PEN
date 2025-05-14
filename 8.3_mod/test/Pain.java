import java.util.*;

public class Pain {
    public static void main(String[] args) {
        // Step 1: Create a list of integers
        List<Integer> numbers = new ArrayList<>(Arrays.asList(10, 5, 8, 20, 15, 3, 12));
        System.out.println("Original list: " + numbers);

        // Step 2: Filter even numbers (i.e., remove even numbers)
        numbers.removeIf(n -> n % 2 == 0);
        System.out.println("After removing even numbers: " + numbers);

        // Step 3: Double the odd numbers
        numbers.replaceAll(n -> n * 2);
        System.out.println("After doubling the odd numbers: " + numbers);

        // Step 4: Sum the numbers using lambda (with forEach)
        final int[] sum = {0};
        numbers.forEach(n -> sum[0] += n);
        System.out.println("Sum of all numbers: " + sum[0]);
    }
}
