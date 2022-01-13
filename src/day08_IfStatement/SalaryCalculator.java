package day08_IfStatement;

public class SalaryCalculator {

    public static void main(String[] args) {

        int hourlyRate = 50,
            weeklyHours = 45;

        double stateTaxRate = 6.5,
               federalTaxRate = 26.2;
        //---------------------------
         int salarayBeforeTax = hourlyRate * weeklyHours * 52;
         double stateTax = salarayBeforeTax * stateTaxRate / 100;
         double federalTax = salarayBeforeTax * federalTaxRate / 100;
         double totalTax = stateTax + federalTax;
         double salaryAfterTax = salarayBeforeTax - totalTax;


        System.out.println("Gross pay is : $" + salarayBeforeTax);
        System.out.println("State tax = $" + stateTax);
        System.out.println("Federal Tax = $" + federalTax);
        System.out.println("Total Tax is = $" + totalTax);
        System.out.println("Net income is = $" + salaryAfterTax);




    }
}
