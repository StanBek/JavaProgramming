package day_10_NestedIf;

public class TerneriesIntro {
    public static void main(String[] args) {
        int n = 100;
        if (n%2==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
        System.out.println("---------------------");
        String result1=(n%2==0)? "Even" : "Odd";
        System.out.println(result1);
        System.out.println("------------------------");


        int age = 21;
        /* if (age >=23) {
        System.out.println("Eligiblr");
    }else{
            System.out.println("NotEligible");
        }

         */
        //System.out.println((age>=21) ? "Eligible":"NotEligible");
        String results2 = (age>=21) ? "Eligible":"NotEligible";
        System.out.println(results2);

        System.out.println("-----------------------------------");
         int num = 100;
         /*
         if (num>0){
             System.out.println("Positive");
         }else if(num<0){
             System.out.println("Negative");
         }else{
             System.out.println("Zero");
         }
          */
        String result3 = (num>0)? "Positive" :(num<0)? "Negative": "Zero";
        System.out.println(result3);
    }
}
