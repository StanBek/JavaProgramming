package Day_17_While_Dowhile;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {

        //userName: "Cydeo";
        //password: "Cydeo123";
        //while(invalid&&hasattempts)
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your username");
        String u = input.next();

        System.out.println("Enter your password");
        String p = input.next();

        if(u.equals("Cydeo")&&p.equals("Cydeo123")){
            System.out.println("Logged in");
        }else{
            int attepmts = 3;
            while (!(u.equals("Cydeo")&&p.equals("Cydeo123"))&&attepmts>0){
                System.out.println("Incorrect username or password,"+
                         "please re-enter");
                System.out.println("Enter your username");
                u= input.next();

                System.out.println("Enter your password");
                p=input.next();
                attepmts--;
            }
            if (u.equals("Cydeo")&&p.equals("Cydeo123")){
                System.out.println("Logged in");
           }else{
                System.out.println("Your account is locked");
            }
        }


        input.close();

    }
}
