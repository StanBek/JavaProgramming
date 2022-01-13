package day05_Concatenation;

public class FullName {

    public static void main(String[] args) {

        String firstName = "Stan";
        String lastName = "Bek";
        int age = 39;
        String jobTitle = "SDET";
        String companyName = "Apple Inc";
        double salary = 95_000;

        String fullName = firstName + " " + lastName;

        System.out.println(fullName + " is " + jobTitle + (", works at ") + companyName + (", Salary is ") + salary);





    }
}
