import java.util.Scanner;

public class Driving {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.print("Enter the distance to drive in miles: ");
        double distance=scanner.nextDouble();

        System.out.print("Enter the fuel efficiency of the car in miles per gallon: ");
        double fuelEfficiency=scanner.nextDouble();

        System.out.print("Enter the price per gallon: ");
        double pricePerGallon=scanner.nextDouble();

        double costOfdrive=(distance / fuelEfficiency) * pricePerGallon;

        System.out.println("The cost of the drive is: $" + costOfdrive);
    }
}