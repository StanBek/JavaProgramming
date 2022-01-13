package Day_15_ForLoop;

public class Stars {

    public static void main(String[] args) {
        for (int i = 1; i <=8 ; i++) {
            for(int x=1; x<=6; x++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
/*
print the following shape:

                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
 */