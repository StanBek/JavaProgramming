package day_12_Scanner;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class NextLinePractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your age = ");
        int age = input.nextInt();

        input.nextLine();
        System.out.println("Please enter you Full name = ");
        String name = input.nextLine();

        System.out.println("Please enter your GP");
        double gpa = input.nextDouble();

        input.nextLine();

        System.out.println("Your age = " + age);
        System.out.println("Your Full name = " + name);
        System.out.println("GPA = " + gpa);

        input.close();
    }
}
/*
Ask teh user to enter the age (nextInt)
ask the user to enter full name(nextLine)
 */