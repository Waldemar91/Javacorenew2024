package resolvehw5.Task2;

import java.util.Arrays;
import java.util.Random;

public class ArrayOperations {
    public static void main(String[] args) {
        // Create an array with 20 random numbers between 1 and 100
        int[] numbers = new Random().ints(20, 1, 101).toArray();

        // 1. Sort the array using the sorted() method
        Arrays.sort(numbers);
        System.out.println("Sorted array: " + Arrays.toString(numbers));

        // 2. Filter multiples of 3 and 10 using filter()
        int[] multiplesOf3 = Arrays.stream(numbers).filter(number -> number % 3 == 0).toArray();
        System.out.println("Кратні 3: " + Arrays.toString(multiplesOf3));
        int[] multiplesOf10 = Arrays.stream(numbers).filter(number -> number % 10 == 0).toArray();
        System.out.println("Кратні 10: " + Arrays.toString(multiplesOf10));

        // 3. Iterate over the array using forEach()
        Arrays.stream(numbers).forEach(num -> System.out.print(num + " "));
        System.out.println();

        // 4. Create a new array with values 3 times larger using map()
        int[] tripledValues = Arrays.stream(numbers).map(num -> num * 3).toArray();
        System.out.println("Tripled values: " + Arrays.toString(tripledValues));

    }
}


