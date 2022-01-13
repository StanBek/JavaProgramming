package day_27_WrapperClasses;

import java.util.Arrays;

public class ReplaceElement {
    public static void main(String[] args) {
        int[]arr={10, 10, 20, 30, 40, 30, 30, 30};
        arr=replaceAll(arr,30,300);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] replaceAll (int[] arr, int oldValue, int newValue){

        for(int i =0;i<arr.length;i++){
            if(arr[i]==oldValue){
                arr[i]=newValue;
            }
        }
        return arr;
    }

    public static double [] replaceAll (double[] arr, double oldValue, double newValue){

        for(int i =0;i<arr.length;i++){
            if(arr[i]==oldValue){
                arr[i]=newValue;
            }
        }
        return arr;
    }

    public static char[] replaceAll (char[] arr, char oldValue, char newValue){

        for(int i =0;i<arr.length;i++){
            if(arr[i]==oldValue){
                arr[i]=newValue;
            }
        }
        return arr;
    }
    
    public static String[] replaceAll (String[] arr, String oldValue, String newValue){

        for(int i =0;i<arr.length;i++){
            if(arr[i].equals(oldValue)){
                arr[i]=newValue;
            }
        }
        return arr;
    }


}
