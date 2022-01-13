package Day_19NestedLoopPractice;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num1 = s.nextInt();

        System.out.println("Enter a math operator:");
        char operator = s.next().charAt(0);

        if (!(operator=='+'||operator=='-')){//if the operator is not valid
            System.err.println("Invalid enters");
            System.exit(0);//terminates the whole program
        }

        System.out.println("Enter a number:");
        int num2 = s.nextInt();

        if (operator=='-'){
            System.out.println(num1-num2);
        }else{
            System.out.println(num1+num2);
        }


    }
}
