package Day_28_ArrayList;

import java.util.Arrays;

public class StrongPassword2 {
    public static void main(String[] args) {

        String password="cldeo1990@";

        int countUpperCase=0;
        int countLowetCase=0;
        int countSpecialChar = 0;
        int countDigits = 0;
        for (int i=0; i<password.length(); i++){
            char each = password.charAt(i);

            if(Character.isUpperCase(each)){
                countUpperCase++;
            }else if(Character.isLowerCase(each)){
                countLowetCase++;
            }else if(Character.isDigit(each)){
                countDigits++;
            }else{
                countSpecialChar++;
            }
        }
        System.out.println("countDigits = " + countDigits);
        System.out.println("countIsUpperCase = " + countUpperCase);
        System.out.println("countIsLowerCase = " + countLowetCase);
        System.out.println("countIsScpecialChar = "+countSpecialChar);
        boolean hasUpperCase = countUpperCase>0;
        boolean hasLowerCase = countLowetCase>0;
        boolean hasDigits = countDigits>0;
        boolean hasSpecialChar = countSpecialChar>0;

        boolean strongPassword = password.length()>=0&&!password.contains(" ")&&hasDigits&&hasSpecialChar&&hasLowerCase&&hasUpperCase;

        System.out.println(strongPassword);
    }
}
