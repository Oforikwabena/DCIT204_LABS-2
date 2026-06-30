import java.util.Scanner;

/**
 * DCIT 204 – Lab 2: Interactive Find Maximum Algorithm
 *
 * This program prompts the user to enter an array of integers,
 * then finds and displays the maximum value and its index.
 *
 * Time Complexity: O(n) — single pass through the array.
 */
public class FindMax {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("===========================================");
        System.out.println("       Interactive Find Maximum Program    ");
        System.out.println("===========================================");

        // Step 1: Get the number of elements
        int size = 0;
        while (size <= 0) {
            System.out.print("\nEnter the number of elements in the array: ");
            if (scanner.hasNextInt()) {
                size = scanner.nextInt();
                if (size <= 0) {
                    System.out.println("  [Error] Please enter a positive integer greater than 0.");
                }
            } else {
                System.out.println("  [Error] Invalid input. Please enter a whole number.");
                scanner.next(); // consume invalid token
            }
        }

        // Step 2: Create the array and collect elements
        int[] array = new int[size];
        System.out.println("\nEnter " + size + " integer value(s) one at a time:");

        for (int i = 0; i < size; i++) {
            System.out.print("  Element [" + i + "]: ");
            while (!scanner.hasNextInt()) {
                System.out.println("  [Error] Invalid input. Please enter a whole number.");
                System.out.print("  Element [" + i + "]: ");
                scanner.next(); // consume invalid token
            }
            array[i] = scanner.nextInt();
        }

        // Step 3: Find the maximum value and its index
        int maxValue = array[0];
        int maxIndex = 0;

        for (int i = 1; i < size; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
                maxIndex = i;
            }
        }

        // Step 4: Display results
        System.out.println("\n-------------------------------------------");
        System.out.println("                   RESULTS                ");
        System.out.println("-------------------------------------------");
        System.out.print("Array: [ ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i]);
            if (i < size - 1) System.out.print(", ");
        }
        System.out.println(" ]");
        System.out.println("Maximum Value : " + maxValue);
        System.out.println("Found at Index: " + maxIndex);
        System.out.println("-------------------------------------------");

        scanner.close();
    }
}
