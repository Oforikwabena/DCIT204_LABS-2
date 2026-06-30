import java.util.Scanner;

public class PairSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("     Interactive Pair Sum Program          ");

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
                scanner.next();
            }
        }

        int[] array = new int[size];
        System.out.println("\nEnter " + size + " integer value(s) one at a time:");

        for (int i = 0; i < size; i++) {
            System.out.print("  Element [" + i + "]: ");
            while (!scanner.hasNextInt()) {
                System.out.println("  [Error] Invalid input. Please enter a whole number.");
                System.out.print("  Element [" + i + "]: ");
                scanner.next();
            }
            array[i] = scanner.nextInt();
        }

        System.out.print("\nEnter the Target Sum: ");
        while (!scanner.hasNextInt()) {
            System.out.println("  [Error] Invalid input. Please enter a whole number.");
            System.out.print("Enter the Target Sum: ");
            scanner.next();
        }
        int targetSum = scanner.nextInt();

        System.out.println("                   RESULTS                ");
        System.out.print("Array     : [ ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i]);
            if (i < size - 1) System.out.print(", ");
        }
        System.out.println("Target Sum: " + targetSum);

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
                    break outerLoop;
                }
            }
        }

        if (!pairFound) {
            System.out.println("No pair found that sums to " + targetSum + ".");
        }



        scanner.close();
    }
}
