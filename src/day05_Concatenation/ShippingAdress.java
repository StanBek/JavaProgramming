package day05_Concatenation;

public class ShippingAdress {

    public static void main(String[] args) {

        String name = "Stan",
                buildingNumber = "12700",
                streetName = "Adair Ln",
                city = "Woodbridge",
                state = "VA",
                zipCode = "22192";

        String address = name + "\n" + buildingNumber + " " + streetName + "\n"
                + city + " " + state + "\n" + zipCode;

        System.out.println(name + "\n" + buildingNumber + " " + streetName + "\n"
                + city + " " + state + "\n" + zipCode);

        /*

        Create a class called ShippingAddress.java
        Declare the following variables:
        name
        buildingNumber
        streetName
        city
        state
        zipCode

Use concatenation to print the full shipping address

         */
    }
}
