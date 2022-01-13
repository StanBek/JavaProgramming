package practice_12_01_21;

import java.util.Scanner;

public class ShopingDiscount {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Please enter your quantity");
         double unitPrice  = 100;
         int quantity = s.nextInt();

         double totalCoast = unitPrice*quantity;
         double totalDiscount = 0;

         if (quantity>10){
             totalDiscount=totalCoast*0.1;
             System.out.println("Your total discount: "+ totalDiscount+ "Your total coast: "+ totalCoast);
         }


    }
}
/*
A shop will give discount of 10% if the cost of
purchased quantity is more than 1000.
	Create a quantity variable
	Suppose, one unit will cost 100.
    Judge and print total cost for user.
	( Scanner Class can be used )

	INPUT for quantity :  5
	EXPECTED : No discount applied

	INPUT for quantiy  :  15
	EXPECTED : You get a discount of $discount and 																			   your total cost is $totalCost

 */