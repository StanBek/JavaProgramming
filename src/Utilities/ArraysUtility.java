package Utilities;

import java.util.Arrays;

public class ArraysUtility {

    //print each integer of an integer array in separate lines
    public static void printEach(int[]array){
        for (int each : array) {
            System.out.println(each);
        }
    }

    //print each double of double array in separate lines
    public static void printEach(double[]array){
        for (double each : array) {
            System.out.println(each);
        }
    }

    //print each char of char array in separate lines
    public static void printEach(char[]array){
        for (char each : array) {
            System.out.println(each);
        }
    }

    //print each String of String array in separate lines
    public static void printEach(String[]array){
        for (String each : array) {
            System.out.println(each);
        }
    }

    //returns the maximum number from integer array
    public static int maxNum(int[]num){
     Arrays.sort(num);
     return num[num.length-1];
    }

    //returns the maximum number from double array
    public static double maxNum(double[]num){
        Arrays.sort(num);
        return num[num.length-1];
    }

    //returns the maximum number from integer array
    public static int minNum(int[]num){
        Arrays.sort(num);
        return num[0];
    }

    //returns the maximum number from double array
    public static double minNum(double[]num){
        Arrays.sort(num);
        return num[0];
    }

    //checks if the given integer is contained in the given array. returns boolean. contains(int[],int)
    public static boolean contains(int[] array, int element){
        boolean result = false;
        for (int each : array) {
            if(each==element){
                result=true;
            }
        }
        return result;
    }

    public static boolean contains(char[] array, char element) {
        boolean result = false;
        for (char each : array) {
            if (each == element) {
                result = true;
            }
        }
        return result;

    }

    public static boolean contains(double[] array, double element) {
        boolean result = false;
        for (double each : array) {
            if (each == element) {
                result = true;
            }
        }
        return result;
    }

    public static boolean contains(String[] array, String element) {
        boolean result = false;
        for (String each : array) {
            if (each.equals(element)) {
                result = true;
            }
        }
        return result;
    }

    public static int frequencyOfElement(int[]array,int element){
        int count=0;
        for(int each:array){
            if(each==element){
                count++;
            }
        }
        return count;
    }

    public static int frequencyOfElement(double[]array,double element){
        int count=0;
        for(double each:array){
            if(each==element){
                count++;
            }
        }
        return count;
    }

    public static int frequencyOfElement(char[]array,char element){
        int count=0;
        for(char each:array){
            if(each==element){
                count++;
            }
        }
        return count;
    }

    public static int frequencyOfElement(String[]array,String element){
        int count=0;
        for(String each:array){
            if(each.equals(element)){
                count++;
            }
        }
        return count;
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

    public static int [] merge(int[]arr1, int[]arr2){
        int result[]={};
        for(int each:arr1){
            result=ArraysUtility.addElement(result,each);
        }
        for(int each:arr2){
            result=ArraysUtility.addElement(result,each);
        }
        return result;
    }

    public static double [] merge(double[]arr1, double[]arr2){
        double result[]={};
        for(double each:arr1){
            result=ArraysUtility.addElement(result,each);
        }
        for(double each:arr2){
            result=ArraysUtility.addElement(result,each);
        }
        return result;
    }

    public static char [] merge(char[]arr1, char[]arr2){
        char result[]={};
        for(char each:arr1){
            result=ArraysUtility.addElemet(result,each);
        }
        for(char each:arr2){
            result=ArraysUtility.addElemet(result,each);
        }
        return result;
    }

    public static String [] merge(String[]arr1, String[]arr2){
        String result[]={};
        for(String each:arr1){
            result=ArraysUtility.addElement(result,each);
        }
        for(String each:arr2){
            result=ArraysUtility.addElement(result,each);
        }
        return result;
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

    public static int[] replace(int[] array, int index, int newElement) {
        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid index: " + index);
            System.exit(0);
        }
        array[index] = newElement;
        return array;
    }

    public static double[] replace(double[] array, int index, double newElement) {
        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid index: " + index);
            System.exit(0);
        }
        array[index] = newElement;
        return array;
    }

    public static char[] replace(char[] array, int index, char newElement) {
        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid index: " + index);
            System.exit(0);
        }
        array[index] = newElement;
        return array;
    }

    public static String[] replace(String[] array, int index, String newElement) {
        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid index: " + index);
            System.exit(0);
        }
        array[index] = newElement;
        return array;
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



