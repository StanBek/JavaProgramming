package Day_11_SwitchScanner;

public class Calculator {
    public static void main(String[] args) {

        int n1 = 66, n2 = 76;
        char operator = '*';
        boolean valid = operator=='+' || operator=='-' || operator == '*'||operator =='/';
        if (valid) {
            //operator: +,-,*,/

            switch (operator) {
                case '+':
                    System.out.println(n1 + n2);
                    break;

                case '-':
                    System.out.println(n1 - n2);
                    break;

                case '*':
                    System.out.println(n1 * n2);
                    break;

                default:
                    System.out.println(n1 / n2);
            }

        }else{
            System.out.println("Invalid");

        }

    }
}
