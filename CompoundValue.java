import java.util.Scanner;
public class CompoundValue {
 public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the monthly saving amount: ");
        double monthlySavingAmount = input.nextDouble();

        double monthlyInterestRate = 0.05 / 12; // Monthly interest rate
        double accountValue = 0;

        for (int i = 1; i <= 6; i++) {
            accountValue = (monthlySavingAmount + accountValue) * (1 + monthlyInterestRate);
        }

        System.out.printf("After the sixth month, the account value is $%.2f%n", accountValue);
    }
}
