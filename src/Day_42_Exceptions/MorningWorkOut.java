package Day_42_Exceptions;

public class MorningWorkOut {

    public static void main(String[] args) {


        System.out.println("-----------------Push up started--------------");
        for (int i = 1; i <= 30; i++) {
            System.out.print("\rPush up "+i);

                sleep(1.5);

        }

        System.out.println("-------------Push ups completed--------------------");

        System.out.println("-----------------Push up started--------------");
        for (int i = 1; i <= 20; i++) {
            System.out.print("\rPush up "+i);

                sleep(2.5);

        }

        System.out.println("-------------Push ups completed--------------------");

    }

    public static void sleep(double second){
        try {
            Thread.sleep((long) (second*1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
