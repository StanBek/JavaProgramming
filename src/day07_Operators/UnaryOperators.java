package day07_Operators;

public class UnaryOperators {

    public static void main(String[] args) {

        int num1 = +25;
        int num2 = -25;

        System.out.println(num1 < 0); // not true
        System.out.println(num2 < 0); // true

        int a = 5;
        ++a; // pre increment: increases the value by 1 right away
        System.out.println(a);

        --a; // pre decrement: decreases the value by 1 right away

        System.out.println(a);


        int b = 100;

        System.out.println(++b); // pre increment;
         int c = 100;

        System.out.println(c++);// post increment:first passes the curent value, then increases the value by 1
        System.out.println(c);// 101

        int x = 200;

        System.out.println(--x);// pre decrement: decreases the value by 1 right away

        int y = 200;
        System.out.println(y--);// post decrement: first passes the curent value, then increases the value by 1
        System.out.println(y);

        int z = 45;
        System.out.println(++z);// 46
        System.out.println(z++);//46
        System.out.println(z);//47

        int q = 30;

        System.out.println(--q);//29
        System.out.println(q--);//29
        System.out.println(q);//28
    }
}
