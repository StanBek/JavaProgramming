package Day_41_Exceptions;

import Day_30_CustomClass.Student;

import java.io.FileInputStream;
import java.sql.SQLOutput;
import java.util.Locale;

public class Checked_vs_Unchecked {

    public static void main(String[] args) {
        //unchecked exceptions:

        int a=10;
        int b=0;
        //System.out.println( a/b );

        char[] characters = {'A','B','C'};
        //System.out.println(characters[99]);

        //Student student = null;
         //student.sleep();

        final String str="Wooden Spoon";
        String str2 = "";//object!=null

        System.out.println(str.isEmpty());

        //str = null;
        //System.out.println(str.toLowerCase());


        //checked Exceptions:

        System.out.println("Hello");

        //Thread.sleep(3000);


        System.out.println("Cydeo");

        //FileInputStream file = new FileInputStream("path of the file")// checked exception

        System.out.println("Java".charAt(2000));//unchecked exception
    }
}
