package Day_13StringClass;

import java.util.Scanner;

public class Initials {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first name: ");
        String FirstName = input.next();

        System.out.println("Enter your Last name: ");
        String LastName = input.next();

        char F = FirstName.charAt(0);
        char L = LastName.charAt(0);

        String initial = F+"."+L;

        System.out.println("initial: "+initial);

        input.close();
    }

}
