package day_10_NestedIf;

public class TernariesWithNestedif {
    public static void main(String[] args) {

        int s = 120;
        if (s >= 0 && s <= 100) {
            if (s >= 60) {
                System.out.println("Passed");
            } else {
                System.out.println("Failed");
            }
        } else {
            System.out.println("Invalid Score");
        }
       String res = (s>=0 && s<=100)? (s>=60)? "Passed":"Failed"
                    :"Invalid score";
        System.out.println(res);
    }
}