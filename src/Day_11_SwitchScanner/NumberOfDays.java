package Day_11_SwitchScanner;

public class NumberOfDays {

    public static void main(String[] args) {
        int num = 2;
        int year = 2001;
        String result = "";
        if (num>=1 && num<=12){

            switch (num) {

                case 2:
                    if (year%4==0) {
                        result = "29 Days";// (year % 4==0)?"29 Days":"28 Days"
                    }else{
                        result = "28 Days";
                    }
                    break;

                case 4:
                case 6:
                case 9:
                case 11:
                    result = "30 Days";
                    break;

                default:
                    result = "31 Days";
            }

        }else{
            result = "Invalid";
        }
        System.out.println(result);

    }
}
