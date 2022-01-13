package day05_Concatenation;

public class PhoneNumber {

    public static void main(String[] args) {
        /*
            countryCode = 1
            areaCode = 703
            localNumber = 4512625
            output: +1(703)-4512625

         */
        String name = "PhoneNumber:",
                countryCode = "+1",
                areCode = "(703)",
                localNumber = "-4512625";

        System.out.println(name + " " + countryCode + areCode + localNumber);
    }
}
