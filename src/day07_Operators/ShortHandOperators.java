package day07_Operators;

public class ShortHandOperators {

    public static void main(String[] args) {

        // assignment: =

        int number = 100;
        System.out.println("number = " + number);// 100

        number = 200;
        System.out.println("number = " + number);// 200
        
        String word = "Java programming";
        System.out.println("word = " + word);

        word = "Wooden Spoon";
        System.out.println("word = " + word);

        word = "123";

        System.out.println("word = " + word);

        System.out.println("------------------------------------");

        //Addition Assignment

        int x = 100;
        System.out.println("x = " + x);// 100

        //x = x + 200;
        x += 200;

        System.out.println("x = " + x);

        String str = "Wooden ";
        
        str +="Spoon";

        System.out.println("str = " + str);
        
        double num1 = 2.5;
        System.out.println("num1 = " + num1);//2.5
        num1 +=5.5;
        System.out.println("num1 = " + num1);
        
        double availbleBalance = 1000.50;
         availbleBalance +=300;
        System.out.println("availbleBalance = " + availbleBalance);

        System.out.println("----------------------------------------");

        //withdrawing 500$;

        availbleBalance -=500;

        System.out.println("availbleBalance = " + availbleBalance);


        //withdrawing 200$; then depositing 400$

        availbleBalance -= 200;
        availbleBalance += 400;

        System.out.println("availbleBalance = " + availbleBalance);

        System.out.println("-----------------------------------");
        
        double salary = 50000.50;
        salary *=2;
        System.out.println("salary = " + salary);

        double dodge = 0.00000001;
        dodge *= 1000000;
        System.out.println("dodge = " + dodge);
        System.out.println("----------------------------");
        
        double num2 = 25000.0;//num2 = mun2 /2
        num2 /= 2;
        System.out.println("num2 = " + num2);

        System.out.println("----------------------------");
        
        double num3 = 100; // %=
        
        num3 %= 3;

        System.out.println("num3 = " + num3);

        System.out.println("-------------------------");

        int amount = 127;
            amount /= 25;
        System.out.println("amount = " + amount);
            amount  %= 25;


        System.out.println("amount = " + amount);

        System.out.println("---------------------------");
        
        int y = 300;
        y %= 16;

        System.out.println("y = " + y);

        System.out.println("-------------------------");
        
        int balance = 3500;// insurance fee : 153$
        
        balance %=153;

        System.out.println("balance = " + balance);

    }
}
