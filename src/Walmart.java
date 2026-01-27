import java.text.NumberFormat;
import java.util.Scanner;

public class Walmart {
    public static void main() {
        double purchaseAmount = 0.0;
        double paymentAmount = 0.0;
        Changer ch;

        final double TOLERANCE = 0.001;
        Scanner scan = new Scanner(System.in);
        NumberFormat moneyFormat = NumberFormat.getCurrencyInstance();

        System.out.println("Welcome to Walmart!");

        System.out.print("Insert purchase amount: ");
        purchaseAmount = scan.nextDouble();

        System.out.print("Insert payment amount: ");
        paymentAmount = scan.nextDouble();

        while(paymentAmount < purchaseAmount){
            System.out.println("Insufficient payment amount!");

            System.out.print("Insert payment amount: ");
            paymentAmount = scan.nextDouble();
        }

        ch = new Changer(purchaseAmount, paymentAmount, TOLERANCE);

        System.out.println("\nYour Change is:");
        System.out.println(moneyFormat.format(paymentAmount - purchaseAmount));

        System.out.println("\nThat will be: ");
        ch.printChange();

    }
}
