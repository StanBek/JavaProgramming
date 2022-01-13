package practice_12_01_21;

public class PationInfo  {

    public static void main(String[] args) {

        String name = "John";
        int age = 39;
        char ch = 'M';
        String dateOfBirth = "12/09/1983";
        boolean isMarried = true;
        String phoneNumber = "3471234567";
        boolean havingInsurance = true;
        String insuranceNumber = "L030203040";
        String employer = "Cydeo";
        double copayWithInsurance = 20.00;
        double copayWithoutInsurance = 250.00;

        System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.println("ch = " + ch);
        System.out.println("dateOfBirth = " + dateOfBirth);
        System.out.println("phoneNumber = " + phoneNumber);
        System.out.println("isMarried = " + isMarried);
        System.out.println("phoneNumber = " + phoneNumber);
        System.out.println("havingInsurance = " + havingInsurance);
        System.out.println("insuranceNumber = " + insuranceNumber);
        System.out.println("employer = " + employer);
        System.out.println("copayWithInsurance = " + copayWithInsurance);
        System.out.println("copayWithoutInsurance = " + copayWithoutInsurance);
        System.out.println("----------------------------------");

        if (havingInsurance){
            System.out.println("havingInsurance = " + havingInsurance);
        }else{
            System.out.println("copayWithInsurance = " + copayWithInsurance);
        }

    }
}
/*
 Task02: Create a class named PatientInfo. declare the following variables:

                         1. name (String)
                         2. age (int)
                         3. gender (char)
                         4. date of birth (String)
                         5. isMarried (boolean)
                         6. phone number (String)
                         7. havingInsurance (boolean)
                         8. Insurance number (String)
                         9. Employer (String)
                        10. copayWithInsurance (double)
                        11. copayWithoutInsurance (double)
 */