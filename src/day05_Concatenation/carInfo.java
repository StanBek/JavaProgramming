package day05_Concatenation;

public class carInfo {

    public static void main(String[] args) {
        /*

        2. Declare the following variables:
        1. year
        2. make
        3. model
        4. miles
        5. color
        6. price

        3. Use concatenation to print the full info of the car in
        the following format:
        Year Make Model, Miles, Color, Price.
        Example:
        2018 Toyota Camry, 50000 miles, Red, $19000
         */
        String year = "1988", make = "GasVolga", model = "Model 2410",
                miles = "99700 miles", color = "Gray", price = "$5000";

        System.out.println(year + " " + make + ", " + model + ", " + miles + ", " + color + " " + price);

    }
}
