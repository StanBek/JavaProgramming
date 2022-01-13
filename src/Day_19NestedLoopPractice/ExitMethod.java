package Day_19NestedLoopPractice;

public class ExitMethod {

    public static void main(String[] args) {

        for (int i = 0; i<5; i++){
            if (i==3){
                //break; termonates the loop
               //continue;// terminates the current iteration of the loop
                System.exit(0);//terminates the program
            }
            System.out.println(i);
        }

        System.out.println("wooden spoon");


    }
}
