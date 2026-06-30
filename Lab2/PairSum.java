import java.util.Scanner;

/**
 * DCIT 204 – Lab 2: Interactive Pair Sum (Brute Force)
 *
 * This program prompts the user to enter an array of integers and a target sum,
 * then uses a brute-force nested loop to find a unique pair of elements whose
 * sum equals the target value.
 *
 * Time Complexity: O(n²) — nested loop over all unique pairs.
 */
public class PairSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("===========================================");
        System.out.println("     Interactive Pair Sum Program          ");
        System.out.println("     (Brute Force Algorithm)               ");
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

        // Step 3: Get the target sum
        System.out.print("\nEnter the Target Sum: ");
        while (!scanner.hasNextInt()) {
            System.out.println("  [Error] Invalid input. Please enter a whole number.");
            System.out.print("Enter the Target Sum: ");
            scanner.next(); // consume invalid token
        }
        int targetSum = scanner.nextInt();

        // Step 4: Brute Force Search — check all unique pairs
        System.out.println("\n-------------------------------------------");
        System.out.println("                   RESULTS                ");
        System.out.println("-------------------------------------------");
        System.out.print("Array     : [ ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i]);
            if (i < size - 1) System.out.print(", ");
        }
        System.out.println(" ]");
        System.out.println("Target Sum: " + targetSum);
        System.out.println("-------------------------------------------");

        boolean pairFound = false;

        outerLoop:
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (array[i] + array[j] == targetSum) {
                    System.out.println("Pair Found!");
                    System.out.println("  Index [" + i + "] = " + array[i]);
                    System.out.println("  Index [" + j + "] = " + array[j]);
                    System.out.println("  Equation: " + array[i] + " + " + array[j]
                            + " = " + targetSum);
                    pairFound = true;
                    break outerLoop; // stop after finding the first valid pair
                }
            }
        }

        if (!pairFound) {
            System.out.println("No pair found that sums to " + targetSum + ".");
        }

        System.out.println("-------------------------------------------");

        scanner.close();
    }
}
