package Day_42_Exceptions;

public class DisadvantageOfThrowKeyword {
    public static void main(String[] args)  {

        System.out.println("Hello");
       // sleep(2.5);//throws keyword
        System.out.println("Hello world");

        System.out.println("=====================");

        System.out.println("Hello");
        MorningWorkOut.sleep(2.5);// try and catch
        System.out.println("Cydeo");
    }

    public static void sleep(double second) throws InterruptedException {

            Thread.sleep((long) (second*1000));

    }
}
