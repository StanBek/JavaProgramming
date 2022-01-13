package day05_Concatenation;

import java.sql.SQLOutput;

public class Calculator {
    public static void main(String[] args) {
        int firstNumber = 100;
        int secondNumber = 50;
        int adition = firstNumber + secondNumber;
        int substraction = firstNumber - secondNumber;
        int multiplication = firstNumber * secondNumber;



        System.out.println(firstNumber + " + " + secondNumber + " = " + adition );
        System.out.println(firstNumber + " - " + secondNumber + " = " + substraction);
        System.out.println(firstNumber + " * " + secondNumber + " = " + multiplication);



    // 100 + 50 = 150
        // 100 - 50 = 50
        // 100 * 50 = 500
    }
}
