package day05_Concatenation;

public class FlightTicket {

    public static void main(String[] args) {
        /*
          create a class named FlightTicket, and declare the following variables:
                1. from
                2. to
                3. ticketPrice
            use concatenation to display the full info of the ticket
        ex:
            From Las Vegas to McLean is $425.5
         */

            String departures = "Las Vegas",
                    arrival = "McLean",
                    ticketPrice = "$425.5";
        System.out.println("From " + departures + " to " + arrival + " is " + ticketPrice);



    }
}
