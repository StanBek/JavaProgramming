package day_10_NestedIf;

public class nameOfMonth {
    public static void main(String[] args) {

        int num = 9;
        String month = "";
        if (num >= 1 && num <= 12) {

            if (num == 1) {
                month = "January";
            } else if (num == 2) {
                month = "February";
            } else if (num == 3) {
                month = "March";
            } else if (num == 4) {
                month = "April";
            } else if (num == 5) {
                month = "May";
            } else if (num == 6) {
                month = "June";
            } else if (num == 7) {
                month = "July";
            } else if (num == 8) {
                month = "August";
            } else if (num == 9) {
                month = "September";
            } else if (num == 10) {
                month = "October";
            } else if (num == 11) {
                month = "november";
            } else {
                month = "December";
            }

        } else {//if number is not vallid
                month="Invalid";
        }
        System.out.println(num + month);

        System.out.println("--------------------------------");
    }
}

