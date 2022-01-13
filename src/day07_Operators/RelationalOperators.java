package day07_Operators;

public class RelationalOperators {

    public static void main(String[] args) {
        //>, >=, <, <=

        boolean results1 = 200 > 40;//true
        System.out.println("results1 = " + results1);

        boolean results2 = 300 >= 150; //true

        System.out.println("results2 = " + results2);
        
        boolean results3 = 100 >=100;// true
        System.out.println("results3 = " + results3);

        boolean results4 = 300>=500; //false

        System.out.println("results4 = " + results4);

        //credit score of 720
        int score = 745;

        boolean isEligibleForLoan = score >= 720;//if the credit score is 720 or greater

        System.out.println("isEligibleForLoan = " + isEligibleForLoan);
        
        boolean result5 = 100 < 120; // true
        System.out.println("result5 = " + result5);
        
        boolean results6 = 200 < 180;// false
        System.out.println("results6 = " + results6);
        
        int studentScore = 59; 
        
        boolean hasFailed = studentScore <= 59;

        System.out.println("hasFailed = " + hasFailed);
        
        boolean results7 = 45 <= 60; // true
        System.out.println("results7 = " + results7);

        System.out.println("--------------------------------------");
        
        int x = 100;
        int y = 200;
        boolean equal = x == y;

        System.out.println("equal = " + equal);//false
        
        boolean results = "Muhtar" == "Good Gay";
        System.out.println("results = " + results);// false
        
        boolean results9 = 'A' == 'a';//false

        System.out.println("results9 = " + results9);//false
        
        boolean results10 = "Java" == "Java";
        System.out.println("results10 = " + results10);//true

        System.out.println("---------------------------------");
        
        //"Hello World" == "hello world" ==> false
        
        boolean results11 = 100 != 200; //true
        System.out.println("results11 = " + results11);
        
        boolean results12 = "Java" != "Break"; //true
        System.out.println("results12 = " + results12);
        
        boolean results13 = 300 != 300;// false
        System.out.println("results13 = " + results13);


    }
}
