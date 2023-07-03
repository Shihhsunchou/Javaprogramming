import java.util.Scanner;
public class CalculateTips {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter subtotal: ");
        double subtotal = input.nextDouble();

        System.out.println("Enter the gratuity rate: ");
        double gratuityRate = input.nextDouble();

        //Calculate the gratuity and total
        double graduity = subtotal * (gratuityRate / 100);
        double total = subtotal + graduity;

        System.out.println("The gratuity is $" + graduity);
        System.out.println("The total is $" + total);

    }
}
