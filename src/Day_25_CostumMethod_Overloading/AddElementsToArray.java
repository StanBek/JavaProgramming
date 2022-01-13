package Day_25_CostumMethod_Overloading;

import java.util.Arrays;

public class AddElementsToArray {

    public static void main(String []args){

        int [] arr= {10,20,40,24};
        int element = 5;
        int[]newArr=addInteger(arr,element);
        System.out.println(Arrays.toString(newArr));
        System.out.println("---------------------------");
        double[]arr2={1.3,1.6,5.4,7.3};
        arr2=addDouble(arr2,5.7);
        System.out.println(Arrays.toString(arr2));
        System.out.println("------------------------------");
        char[]arr3={'a','r','y'};
        arr3=addChar(arr3,'o');
        System.out.println(Arrays.toString(arr3));
        System.out.println("-----------------------------");
        String[]arr4={"Stan","Bek","Meery","Adika"};
        arr4=addString(arr4, "Tima");
        System.out.println(Arrays.toString(arr4));
    }

    public static int [] addInteger(int[]arr, int element){
        int[] result = new int [arr.length+1];

        int i=0;
        for (int each : arr) {
            result[i]=each;
            i++;
        }
        result[i]=element;

        return result;
    }

    public static double[] addDouble(double[]arr, double element){
        double[] result = new double[arr.length+1];
        int i =0;
        for (double each : arr) {
            result[i++]=each;
        }
        result[i]=element;
        return result;
    }

    public static char[] addChar(char[]arr, char element){
        char[]result=new char[arr.length+1];
        int i=0;
        for (char each : arr) {
            result[i++]=each;
        }
        result[i]=element;
        return result;
    }

    public static String[] addString(String[]arr, String element){
        String []result = new String[arr.length+1];
        int i=0;

        for (String each : arr) {
            result[i++]=each;
        }
        result[i]=element;
        return result;
    }

}
