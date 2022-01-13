package day_12_Scanner;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class ShippingAdress {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Full name = ");
        String FulName = input.nextLine();

        System.out.println("Enter your building number = ");
        String num1 = input.next();

        input.nextLine();

        System.out.println("Enter your street name = ");
        String StreetName = input.nextLine();

        System.out.println("Enter your state = ");
        String StateName = input.nextLine();

        System.out.println("Enter your zip code = ");
        String num2 = input.next();

        System.out.println("Full name = " + FulName);
        System.out.println("Building number = " + num1);
        System.out.println("Street name = " + StreetName);
        System.out.println("State name = " + StateName);
        System.out.println("Zip code = " + num2);

        input.close();
    }
}
