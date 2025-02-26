import java.util.Scanner;

public class FactorialCalculator {

    public static int getNonNegativeInteger() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        while (!scanner.hasNextInt()) {
            System.out.println("That's not a valid integer. Please try again.");
            scanner.next();
        }
        int number = scanner.nextInt();
        while (number < 0) {
            System.out.println("Please enter a non-negative integer.");
            number = scanner.nextInt();
        }
        return number;
    }

    public static long calculateFactorial(int n) {
        if (n == 0) {
            return 1;
        }
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        int number = getNonNegativeInteger();
        long result = calculateFactorial(number);
        System.out.println("The factorial of " + number + " is: " + result);
    }
}
