package Day_15_ForLoop;

public class ForLoopPractices {
    //15 16 17 18 19 .....45

    public static void main(String[] args) {

        for(int i=15; i<=45; i++){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("Hello");

        for(int i=100; i>=50; i--){
            System.out.print(i+" ");
        }
        System.out.println("------------------------");

        for (int i =1; i<=55; i++){

            if (i%2==0){
                System.out.print(i+" ");
            }
            }
        System.out.println();
        System.out.println("-----------------------------------");

        //print all the even numbers between 1~55: 2,2,4,6,8...54
        for (int i=1; i<=55; i+=2){//i:2,4,6,8...54
            System.out.print(i+" ");
        }
        System.out.println();


        }
}
