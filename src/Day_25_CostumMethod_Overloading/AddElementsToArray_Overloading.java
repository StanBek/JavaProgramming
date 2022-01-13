package Day_25_CostumMethod_Overloading;

import java.util.Arrays;

public class AddElementsToArray_Overloading {

    public static void main(String[]args){

        int [] numbers={1,2,3,4,5,6};//7
        numbers=addElement(numbers,7);
        char[] chars={'a','v','d'};//'e'
        chars=addElemet(chars,'e');
        String[] names={"Stan","Bek","Sin"};//"Tim"
        names=addElement(names,"Tim");
        System.out.println(Arrays.toString(numbers)+Arrays.toString(chars)+Arrays.toString(names));
    }


    public static int [] addElement(int[]arr, int element){
        int[] result = new int [arr.length+1];

        int i=0;
        for (int each : arr) {
            result[i]=each;
            i++;
        }
        result[i]=element;

        return result;
    }

    public static double[] addElement(double[]arr, double element){
        double[] result = new double[arr.length+1];
        int i =0;
        for (double each : arr) {
            result[i++]=each;
        }
        result[i]=element;
        return result;
    }

    public static char[] addElemet(char[]arr, char element){
        char[]result=new char[arr.length+1];
        int i=0;
        for (char each : arr) {
            result[i++]=each;
        }
        result[i]=element;
        return result;
    }

    public static String[] addElement(String[]arr, String element){
        String []result = new String[arr.length+1];
        int i=0;

        for (String each : arr) {
            result[i++]=each;
        }
        result[i]=element;
        return result;
    }

}
