package day_27_WrapperClasses;

import Utilities.ArraysUtility;

import java.util.Arrays;

public class RemoveDublicates {

    public static void main(String[] args) {
        int[]arr={1,1,1,1,2,2,3,3,4,4,4};
        arr=removeDublicate(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("----------------------------");

        String[] words = {"Tin","Tin","Dan","Dan","Stan"};
        words=removeDublicate(words);
        System.out.println(Arrays.toString(words));
    }
    public static int[] removeDublicate(int[]arr){
        int[]result={};
        for(int each:arr){
            if(!ArraysUtility.contains(result,each)){
                result=ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }

    public static double [] removeDublicate(double[]arr){
        double[]result={};
        for(double each:arr){
            if(!ArraysUtility.contains(result,each)){
                result=ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }

    public static char [] removeDublicate(char[]arr){
        char[]result={};
        for(char each:arr){
            if(!ArraysUtility.contains(result,each)){
                result=ArraysUtility.addElemet(result,each);
            }
        }
        return result;
    }

    public static String [] removeDublicate(String[]arr){
        String[]result={};
        for(String each:arr){
            if(!ArraysUtility.contains(result,each)){
                result=ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }
}
