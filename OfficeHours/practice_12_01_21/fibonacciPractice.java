package practice_12_01_21;

public class fibonacciPractice {

    public static void main(String []args){

        int number = 8;
        int num1=0;
        int num2=1;
        int result = 0;

        for(int i=0; i<number; i++){
            result=num1+num2;
            num1=num2;
            num2=result;
            System.out.println(result);
        }


    }
}
