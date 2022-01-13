package day_12_Scanner;

public class GradeLevel {

    public static void main(String[] args) {

        byte num = 10;
        String result = "";

       /* if(num>=1&&num<=18){//1~18

            switch (num){
                case 6: case 7: case 8:
                    result = "Middle School";
                    break;
                case 9: case 10: case 11: case 12:
                    result = "High School";
                case 13: case 14: case 15: case 16:
                    result = "College";
                    break;
                case 17: case 18:
                    result = "Grad School";
                    break;

                default:
                    result= "Elementary School";
            }
        }else{
            result = "Invalid Grade";
        }
        System.out.println(result);
        */
        switch (num){
            case 1: case 2: case 3:case 4: case 5:
                result = "Elementary school";
                break;

            case 6: case 7: case 8:
                result = "Middle School";
                break;
            case 9: case 10: case 11: case 12:
                result = "High School";
            case 13: case 14: case 15: case 16:
                result = "College";
                break;
            case 17: case 18:
                result = "Grad School";
                break;

            default:
                result= "Invalid";

    }
        System.out.println(result);

    }
}
