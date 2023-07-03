import java.util.Scanner;

public class CylinderVolume {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter the radius of the cylinder: ");
        double radius=input.nextDouble();

        System.out.println("Enter thr lenght of the cylinder: ");
        double lenght=input.nextDouble();

        // Calculate the area and volume
        double area=Math.PI * Math.pow(radius, 2);
        double volume=area * lenght;

        System.out.println("The area is " + area);
        System.out.println("The volume is " + volume);
    }
    
}