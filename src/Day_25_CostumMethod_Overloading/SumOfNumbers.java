package Day_25_CostumMethod_Overloading;

public class SumOfNumbers {
    public static void main(String[]args){
        int sum=sumOfNumbers(10,20);
        int sum2=sumOf3Numbers(10,20,30);
        int sum3=sunOf4Numbers(10,20,30,40);
        System.out.println("Sum= "+sum2);
    }
    public static int sumOfNumbers(int num1, int num2){
        return num1+num2;
    }

    public static int sumOf3Numbers(int num1,int num2, int num3){
        return num1+num2+num3;
}

    public static int sunOf4Numbers(int num1, int num2, int num3,int num4){
        return num1+num2+num3+num4;
    }
    }