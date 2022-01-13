package day04_Variables;

public class EmpoyeeInfo {

    /*
    name (string)
    age (int)
    gender (char)
    company (String)
    jobTitle (String)
    yearsOfExpereince (double)
    salary (int)
    isFulltime (boolean)
    isMarried (boolean)
    EmployeeId (String)
    SSN (String)
     */
    public static void main(String[] args) {

        String name = "Arstan";
        int age = 39;
        char gender = 'M';
        String company = "Apple inc";
        String jobTitle = "SDET";
        double yearsOfExperience = 2.5;
        int salary = 120000;
        boolean isFullTime = true;
        boolean isMaried = false;
        String employeeID = "A101";
        String SSN = "(123)-45-6789";

        System.out.println("name = " + name);
        System.out.println("employeeID = " + employeeID);
        System.out.println("gender = " + gender);
        System.out.println("age = " + age);
        System.out.println("jobTitle = " + jobTitle);
        System.out.println("company = " + company);
        System.out.println("yearsOfExperience = " + yearsOfExperience);
        System.out.println("salary = " + salary);
        System.out.println("isMaried = " + isMaried);
        System.out.println("SSN = " + SSN);
    }


}
