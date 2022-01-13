package day_27_WrapperClasses;

import java.sql.SQLOutput;

public class WrappedClassecIntro {

    public static void main(String[]args){
        int num1 = 200;
        Integer n1 = num1;

        int num2=n1;

        System.out.println("---------------------------------");

        Integer integerValue = 100;
        long longValue = integerValue;

        Byte b1=25;
        byte a1=b1;
        short a2 = b1;
        int a3=b1;
        long a4 = b1;

        System.out.println("--------------------------------");

        int num3=200;
        //Long l2=num3;
        //Double d1=num3;
        Integer num4=num3;//autoboxing

        Integer z=900;
        Integer y=z;

        System.out.println("----------------------------------");



    }
}
