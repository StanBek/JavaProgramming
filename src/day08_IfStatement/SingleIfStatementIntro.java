package day08_IfStatement;

public class SingleIfStatementIntro {

    public static void main(String[] args) {
        int number = 299;
        boolean evenNumber = number %2 == 0;
        boolean oddNumber = !evenNumber;
        if (evenNumber){//even number
            System.out.println(number + " is even number");
        }

        if (oddNumber){//not even number
            System.out.println(number + " is odd number");
        }

        System.out.println("---------------------------------------------");

        int n = 200;
        if(n>0){
            System.out.println(n+" is positive");
        }
        if(n<0){
            System.out.println(n+" is negative");
        }
        if(n==0){
            System.out.println(n+" is zero");
        }
    }
}
