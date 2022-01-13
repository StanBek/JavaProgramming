package day_27_WrapperClasses;

import com.sun.jdi.IntegerValue;

public class WrapperClassMethods {

    public static void main(String[] args) {
        String str = "123";

        int num = Integer.parseInt(str);//int

        System.out.println(num+1);
        System.out.println(str+1);

        String str2="10.5";

        double num1=Double.parseDouble(str2);//double

        System.out.println(num1);

        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;

        System.out.println(max);

        System.out.println(min);

        String s1="maybe";

        boolean r1=Boolean.parseBoolean(s1);

        System.out.println(r1);

        System.out.println("-----------------------------");

        String s2="123";
        Integer x=Integer.valueOf(s2);//integer
        int y=Integer.valueOf(s2);//integer

        System.out.println(x);
        System.out.println(y);

        String s3 = "1.5";

        double z =Double.valueOf(s3);//double

        System.out.println(z);


        char ch1 = '!';

        boolean r2 = Character.isDigit(ch1);

        boolean r3 = Character.isLetter(ch1);

        boolean r4=!Character.isLetterOrDigit(ch1);

        boolean r5 = Character.isUpperCase(ch1);

        boolean r6=Character.isLowerCase(ch1);

        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
        System.out.println(r5);
        System.out.println(r6);

        System.out.println("-------------------------------------");

        String s = "ab1cde2efg3hi4";
        int sum = 0;

        for(char each:s.toCharArray()){
            if(Character.isDigit(each)){
                sum+=Integer.parseInt(each+"");
            }
        }
        System.out.println(sum);
    }
}
