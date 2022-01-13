package Day_25_CostumMethod_Overloading;

import javax.print.DocFlavor;
import java.util.Arrays;

public class MergeArraysWithDiferentDataTypes_Overloading {
    public static void main(String[]args){
        int arr1[]={17,34,3,56};
        int arr2[]={13,76,43,4};
        int arr3[]=mergeArrays(arr1,arr2);



        System.out.println(Arrays.toString(arr3));

    }

    public static int[]mergeArrays(int[]arr1,int[]arr2){
        int[]arr3=new int[arr1.length+ arr2.length];
        int i = 0;
        for (int num : arr1) {
            arr3[i++]=num;
        }
        for (int num : arr2) {
            arr3[i++]=num;

        }
        return arr3;
    }
    public static String []mergeArrays(String[]arr1, String[]arr2){
        String []arr3=new String [arr1.length+ arr2.length];
        int i = 0;
        for (String each : arr1) {
            arr3[i++]=each;
        }
        for (String each : arr2) {
            arr3[i++]=each;

        }
        return arr3;
    }
    public static char[]mergeArrays(char[]arr1,char[]arr2){
        char[]arr3=new char[arr1.length+ arr2.length];
        int i = 0;
        for (char ch : arr1) {
            arr3[i++]=ch;
        }
        for (char ch : arr2) {
            arr3[i++]=ch;

        }
        return arr3;
    }
    public static double[]mergeArrays(double[]arr1,double[]arr2){
        double[]arr3=new double[arr1.length+ arr2.length];
        int i = 0;
        for (double num : arr1) {
            arr3[i++]=num;
        }
        for (double num : arr2) {
            arr3[i++]=num;

        }
        return arr3;
    }
}

