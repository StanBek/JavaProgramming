package Day_17_While_Dowhile;

public class BranchingStatemenrs2 {

    public static void main(String[] args) {

        for (char i = 'A'; i <='E' ; i++) {

            if (i=='C'){
                //break;
                continue;
            }
            System.out.println(i);
        }

        System.out.println("----------------------------------");
        // print all even numbers 1~10

        for (int i = 1; i <11; i++) {
            if(i%2==0){
                continue;

            }
            System.out.println(i);
        }

        for (int i =1; i<11; i++){
            if (i%2!=0){
                continue;
            }
            System.out.println(i);
        }

        System.out.println("---------------------------------");



    }
}
