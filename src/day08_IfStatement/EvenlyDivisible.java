package day08_IfStatement;

import javax.sound.midi.Soundbank;

public class EvenlyDivisible {

    public static void main(String[] args) {

        int number = 65;

        boolean DivisibleBy2 = number % 2 == 0;
        boolean DivisibleBy3 = number % 3 == 0;
        boolean DivisibleBy5 = number % 5 == 0;

        System.out.println(number + " is Divisible by 2 " + DivisibleBy2);
        System.out.println(number + " is Divisible by 3 " + DivisibleBy3);
        System.out.println(number + " is Divisible by 2 " + DivisibleBy5);

    }
}
