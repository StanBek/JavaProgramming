package Day_26_CostumMethodPractice;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5};
        int[]reverse=reverse(arr);
        System.out.println(Arrays.toString(reverse));
    }

    public static int[] reverse(int[]arr){
        int[]reverse=new int[arr.length];

        for(int i=arr.length-1, j=0; i>=0; j++,i--){
            reverse[j]=arr[i];
        }
        return reverse;
    }

    public static double[] reverse(double[]arr){
        double[]reverse=new double[arr.length];

        for(int i=arr.length-1, j=0; i>=0; j++,i--){
            reverse[j]=arr[i];
        }
        return reverse;
    }

    public static char[] reverse(char[]arr){
        char[]reverse=new char[arr.length];

        for(int i=arr.length-1, j=0; i>=0; j++,i--){
            reverse[j]=arr[i];
        }
        return reverse;
    }

    public static String[] reverse(String[]arr){
        String[]reverse=new String[arr.length];

        for(int i=arr.length-1, j=0; i>=0; j++,i--){
            reverse[j]=arr[i];
        }
        return reverse;
    }
    
}
