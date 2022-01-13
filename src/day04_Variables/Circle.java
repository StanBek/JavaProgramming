package day04_Variables;

public class Circle {

    public static void main(String[] args) {
     // PI, radius, diameter, area, perimeter 
        double PI = 3.14;
        double radius = 3.5;
        double diameter = radius * 2; // 10*2
        double area = radius * radius * PI;// 10*10*3.14
        double perimeter = diameter * PI;//10*2*3.14

        System.out.println("radius = " + radius);
        System.out.println("diameter = " + diameter);
        System.out.println("perimeter = " + perimeter);
        System.out.println("perimeter = " + perimeter);

    }
}
/*
Create a class named Circle, write a program that can calculate the area & perimeter of any given Circle
                    Hints:  PI = 3.14
                            area = radius * radius * PI
                            Perimeter = 2 * radius * PI

4. Create a class named KgToPounds, write a program that can convert kg (int) to pounds (double)
                    Hints: 1 kg = 2.2 pounds

5. Create a class named GallonsToLitters, Write a program that can convert gallon (int) to litter (double)
                    Hints: 1 gallon = 3.79 litters
 */