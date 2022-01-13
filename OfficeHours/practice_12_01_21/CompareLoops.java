package practice_12_01_21;

public class CompareLoops {

    public static void main(String[]args){
        int num=10;

        for (int i = num; i < 5; i++) {
            System.out.println("Hello batch for Loop");
        }
        System.out.println("================================");

        if(num<5){
            System.out.println("Hello batch for Loop");
        }

        while(num<5){
            System.out.println("Hello batch for Loop");

        }
        do{
            System.out.println("Hello batch for Loop");
        }while(num<5);
    }
}
