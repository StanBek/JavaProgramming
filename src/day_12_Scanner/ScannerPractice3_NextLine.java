package day_12_Scanner;

import java.util.Scanner;

public class ScannerPractice3_NextLine {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full Name");

        String name = input.nextLine();

        System.out.println("Enter your Programming Language");
        String programming = input.nextLine();

        System.out.println("Enter your age");
        int age = input.nextInt();

        input.nextLine();

        System.out.println("Enter your school name");
        String schoolName = input.nextLine();

        System.out.println("Full name " + name);
        System.out.println("Programming " + programming);
        System.out.println("age" + age);
        System.out.println("School name " + schoolName);

        input.close();
    }
}
