package Day_26_CostumMethodPractice;

import java.util.Arrays;

public class RemoveElements {
    public static void main(String[]args){
        int[]numbers={100,200,300,400,500};
        numbers = removeIndex(numbers,1);
        System.out.println(Arrays.toString(numbers));
    }

    public static int[] removeIndex(int[]array, int index){
        int[] result=new int[array.length-1];
        int j=0;
        for (int i=0; i< array.length; i++) {
            if (i == index){
                continue;
            }
            result[j++]=array[i];
        }
            return result;
    }

    public static double[] removeIndex(double[]array, int index){
        double[] result=new double[array.length-1];
        int j=0;
        for (int i=0; i< array.length; i++) {
            if (i == index){
                continue;
            }
            result[j++]=array[i];
        }
        return result;
    }

    public static String[] removeIndex(String[]array, int index){
        String[] result=new String[array.length-1];
        int j=0;
        for (int i=0; i< array.length; i++) {
            if (i == index){
                continue;
            }
            result[j++]=array[i];
        }
        return result;
    }

    public static char[] removeIndex(char[]array, int index){
        char[] result=new char[array.length-1];
        int j=0;
        for (int i=0; i< array.length; i++) {
            if (i == index){
                continue;
            }
            result[j++]=array[i];
        }
        return result;
    }
}
