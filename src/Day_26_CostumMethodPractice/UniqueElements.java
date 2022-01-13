package Day_26_CostumMethodPractice;

import Utilities.ArraysUtility;

import java.util.Arrays;

public class UniqueElements {
    public static void main (String[]args){
        int[]array={1,1,1,4,5,6,6,7};
        int[]unique=uniqueElement(array);
        System.out.println(Arrays.toString(unique));
    }
    //return the unique elements of the array as a new array
    public static int[] uniqueElement(int[]array){
        int[]result={};
        for (int each : array) {
            if(ArraysUtility.frequencyOfElement(array,each)==1){
                result=ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }

    public static char[] uniqueElement(char[]array){
        char[]result={};
        for (char each : array) {
            if(ArraysUtility.frequencyOfElement(array,each)==1){
                result=ArraysUtility.addElemet(result,each);
            }
        }
        return result;
    }

    public static String[] uniqueElement(String[]array){
        String[]result={};
        for (String each : array) {
            if(ArraysUtility.frequencyOfElement(array,each)==1){
                result=ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }

    public static double[] uniqueElement(double[]array){
        double[]result={};
        for (double each : array) {
            if(ArraysUtility.frequencyOfElement(array,each)==1){
                result=ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }
}
