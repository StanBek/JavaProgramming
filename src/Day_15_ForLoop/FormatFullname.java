package Day_15_ForLoop;

import java.util.Locale;

public class FormatFullname {

    public static void main(String[] args) {
        String firstName = "cyDEo",
                lastName = "SCHOOL";
        //firstName=firstName.substring(0,1).toUpperCase()+firstName.substring(1).toLowerCase();
                                     // C                  + ydeo ====> Cydeo

        firstName=(""+firstName.charAt(0)).toUpperCase()+firstName.substring(1).toLowerCase();
                                    // "C"              + ydeo ======> Cydeo

        lastName = lastName.substring(0,1).toUpperCase()+lastName.substring(1).toLowerCase();

        System.out.println(firstName+" "+lastName);

    }
}
