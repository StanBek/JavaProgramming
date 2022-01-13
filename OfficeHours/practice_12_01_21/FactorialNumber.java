package practice_12_01_21;

import java.util.Scanner;

public class FactorialNumber {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Please enter ny number:");
        int number = s.nextInt();
        int result = 1;

        //if (number>2){//output: 120  ( because: 5! = 5 * 4 * 3 * 2* 1 = 120 )
            for (int i = number; i >= 1; i--) {
                result*=i;
            }
       // }else{
            //result=number;
       // }
        System.out.println(result);

    }
}
/*
  Ex:
  input: 5
  output: 120  ( because: 5! = 5 * 4 * 3 * 2* 1 = 120 )
 */