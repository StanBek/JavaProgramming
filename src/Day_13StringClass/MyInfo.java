package Day_13StringClass;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class MyInfo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = input.nextInt();

        System.out.println("Enter your gender:");
        String gender = input.next();

        input.nextLine();

        System.out.println("Enter your full name");
        String fullName = input.nextLine();

        System.out.println("Enter phone name:");
        long phoneNumber = input.nextLong();

        System.out.println("Enter your zip code:");
        int zipcode = input.nextInt();

        input.nextLine();

        System.out.println("Enter your School name");
        String SchoolName = input.nextLine();

        System.out.println("Enter your city:");
        String CityName = input.nextLine();

        System.out.println("Enter state name");
        String StateName = input.nextLine();

        System.out.println("building number");
        int buildNumber = input.nextInt();

        input.nextLine();

        System.out.println("Enter your Street name");
        String StreetName = input.nextLine();

        input.close();

        System.out.println("Full name: " + fullName);
        System.out.println("Age: " + age);
        System.out.println("Gender "+ gender);
        System.out.println("Phone Number " + phoneNumber);
        System.out.println("Address: \n\t"+ buildNumber +" "+StreetName+"\n\t"+
                CityName + ", "+ StateName + " "+zipcode);
        System.out.println("School name: "+ SchoolName);
    }
}
/*
Create a class called MyInfo. Write a program that can ask the user to:
            1. Enter your age (int)
            2. Enter your gender (String- One word ONLY)
            3. Enter your full name (String- Multiple words)
            4. Enter your phone number (long)
            5. Enter your zip code (int)
            6. Enter your School name (String- Can be Multiple words)
            7. Enter your city name (String- Can be Multiple words)
            8. Enter your state name (String- One word ONLY)
            9. Enter your building number (int)
            10. Enter your Street name

        MAKE SURE USER CAN ENTER ALL THE INPUT
 */