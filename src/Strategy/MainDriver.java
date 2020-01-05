package Strategy;

import java.util.Scanner;

public class MainDriver {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String paymentOption;

        System.out.println("Welcome\nPlease select option below");
        System.out.println("A - for cash payment");
        System.out.println("B - for card payment");
        System.out.print("Please choose payment option: ");
        paymentOption = input.nextLine();

        System.out.printf("You have selected %s for payment", paymentOption);

    }
}
