package day08_IfStatement;

public class EligibleToVote {

    public static void main(String[] args) {

        String name = "Stan",
                citizen = "KG";
        int age = 39;
        boolean isEligible = age >= 21 && citizen == "USA";
        if(isEligible){
            System.out.println("Eligible");
        }

        // eligible

        // not eligible

        if(!isEligible){
            System.out.println("Not Eligible");
        }
    }
}
