package Day_41_Exceptions;

public class FinallyBlock {

    public static void main(String[] args) {

        int[]arr={1,2,3};


        try {
            System.out.println("java".charAt(1000));
            System.out.println(arr[10]);
            System.out.println("Try block");
        }catch (RuntimeException e){
            e.printStackTrace();
            System.out.println("Catch block");
            System.exit(0);
        }finally {
            System.out.println("Finally block");
        }

    }
}
