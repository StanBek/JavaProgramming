package Day_11_SwitchScanner;

public class DaysInWeek {

    public static void main(String[] args) {

        int num = 9;

        switch (num){//compare 1,2,3,4,5,6,7 ==

            case 1:
                System.out.println("Monday");
                break;//

            case 2:
                System.out.println("Tuesday");
                break;// exits the switch after executing the case block

            case 3:
                System.out.println("Wednesday");//exits the switch after executing the case bloc
                break;

            case 4:
                System.out.println("Thursday");//exits the switch after executing the case bloc
                break;

            case 5:
                System.out.println("Friday");// exits the switch after executing the case bloc
                break;

            case 6:
                System.out.println("Saturday");//exits the switch after executing the case bloc
                break;

            case 7:
                System.out.println("Sunday");//exits the switch after executing the case bloc
                break;

            default:
                System.out.println("Invalid");

        }




    }
}
