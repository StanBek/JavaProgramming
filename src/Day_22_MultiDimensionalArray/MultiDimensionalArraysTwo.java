package Day_22_MultiDimensionalArray;

import java.util.Arrays;

public class MultiDimensionalArraysTwo {

    public static void main(String[] args) {

        int[] arr1 = {1,2,3};
        int[] arr2 = {4,5,6};
        int[] arr3 = {7,8,9};

        int[][] arr2D = {{1,2,3},{4,5,6},{7,8,9}};

        //3 dimensional array contains 2d arrays

        int[][][] arr3D = {{{1,2,3},{4,5,6},{7,8,9}},{{10,20,30},{40,50,60},{70,80,90}}};

        System.out.println(Arrays.deepToString(arr3D));

        System.out.println(Arrays.toString(arr3D[1][1]));

        System.out.println(arr3D[0][2][2]);
        System.out.println("------------------------------");
        for (int[][] each2d:arr3D) {
            for (int[]each1d:each2d){
                for (int element:each1d){
                    System.out.println(element);
                }
            }
        }

        System.out.println("-------------------------------------");

        int [][][][] arr4D = {{{{1,2,3},{4,5,6},{7,8,9}},{{10,20,30},{40,50,60},{70,80,90}}}};

        for (int[][][]each3d:arr4D){
            for (int[][]each2d:each3d){
                for (int[] each1d : each2d) {
                    for (int elemenet : each1d) {
                        System.out.println(elemenet);

                    }

                }
            }
        }

    }
}
