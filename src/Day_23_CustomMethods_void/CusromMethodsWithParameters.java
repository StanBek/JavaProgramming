package Day_23_CustomMethods_void;

public class CusromMethodsWithParameters {

    public static void main(String[] args){
        oddOrEven(7);// the method demands additional info to complete its task

        ageOfPerson(1982);
    }
    //create a function that can check if the numbers is odd number or even number

    public static void oddOrEven(int number){
        if(number%2==0){
            System.out.println(number+" is even number");
        }else{
            System.out.println(number+" is odd number");
        }
        }

    //create a function that can display the age of the person

    public static void ageOfPerson(int birthYear){
        int age=2021-birthYear;
        System.out.println("Your age is: "+age);
        }

    //create function that can print all the numbers between X and Y
    public static void printNumbers(int x, int y){

    }
}
