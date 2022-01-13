package day08_IfStatement;

public class LogicalOperators {

    public static void main(String[] args) {

        int age = 19;
        String citizen = "UK",
                name = "Steven";
        boolean isElligible = age >= 18 && citizen == "USA";
        //

        System.out.println(name + " is Eligible to vote: " + isElligible);

        //&& - both; || - ether;

        System.out.println("--------------------------------------");

        String name2 = "Stan";
        int creditscore = 720,
                age2 = 23,
                income = 40000;
        boolean isEligible2 = creditscore >=700 && age2>=21 && income>=60000;
        System.out.println(name2 + " is Eligible for the Loan " + isEligible2);

        System.out.println("----------------------------------------");

        String name3 = "Ad";
        int age3 = 21;
        char gender = 'F';
        boolean isEloigible3 = age3 >= 18 && (gender == 'M' || gender == 'F');

        System.out.println(name3 + " is Eligible for register: " + isEloigible3);

        System.out.println("-------------------------------------------");

        String name4 = "Tim",
                countryofBirth = "USA";
        boolean marriedToUScitizen = false,
                isEligible4 = countryofBirth == "USA" || marriedToUScitizen == true;

        System.out.println(name4 + " is Eligible to aply for US citizenShip: " + isEligible4);

        System.out.println("------------------------------------");

        String student = "Ann";
        double gpa = 2.5;
        int familyIncome = 400000;
        boolean isEligible5 = gpa >= 3.5 || familyIncome <= 60000;

        System.out.println(student + " is Eligible for scholarship " + isEligible5);

        System.out.println("---------------------------------");
        boolean results2 = true;
        System.out.println("result2 = " + results2);
        boolean results3 = !results2;
        System.out.println("result3 = " + results3);






    }
}
