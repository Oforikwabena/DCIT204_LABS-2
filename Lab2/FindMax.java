import java.util.Scanner;

public class FindMax {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("===========================================");
        System.out.println("       Interactive Find Maximum Program    ");
        System.out.println("===========================================");

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

        int maxValue = array[0];
        int maxIndex = 0;

        for (int i = 1; i < size; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
                maxIndex = i;
            }
        }

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
