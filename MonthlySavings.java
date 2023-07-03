import java.util.Scanner;

public class MonthlySavingsCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the monthly saving amount: ");
        double monthlySavingAmount = scanner.nextDouble();

        double accountValue = 0.0;
        for (int i = 1; i <= 6; i++) {
            accountValue = (accountValue + monthlySavingAmount) * (1 + 0.00417);
        }

        System.out.printf("The account value after the sixth month is: $%.2f%n", accountValue);
    }
}