package Day_25_CostumMethod_Overloading;
import Utilities.ArraysUtility;
public class Test2 {


    public static void main(String[] args) {

        int []arr1={1,2,3,4,5};
        ArraysUtility.printEach(arr1);

        System.out.println("-------------------------------");

        double []arr2={1.3,3.5,4.5,5.6};
        ArraysUtility.printEach(arr2);

        System.out.println("----------------------------------");

        char[]arr3={'a','d','r','g'};
        ArraysUtility.printEach(arr3);

        System.out.println("-------------------------------------");

        String[]arr4={"Stan","Bek","Adika","Tim","Mery"};
        ArraysUtility.printEach(arr4);

        System.out.println("----------------------------------------");

        int[]n1={1,2,4,6,7,3};
        int max1=ArraysUtility.maxNum(n1);
        System.out.println(max1);

        System.out.println("--------------------------------------------");

        double []n2={1.3,4.5,6.5,3.2};
        double max2=ArraysUtility.maxNum(n2);
        System.out.println(max2);

        System.out.println("----------------------------");

        int[]a1={1,2,3,4,5,6};
        boolean r1=ArraysUtility.contains(a1,9);
        System.out.println(r1);
    }


}
