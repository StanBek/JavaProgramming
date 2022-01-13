package Day_21_ForEachLoop;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {

        int[] numbers = {10,20,30,40,50};
        int [] reversNumbers = new int[numbers.length];

        for (int i = numbers.length-1, j=0; i >=0 ; i--,j++) {
            reversNumbers[j]=numbers[i];

        }
       /*
                    j             i
        reversNumbers[0]= numbers[3];
        reversNumbers[1]=numbers[2];
        reversNumbers[2]=numbers[1];
        reversNumbers[3]=numbers[0]
        //{50,40,30,20,10}

        */
        System.out.println(Arrays.toString(reversNumbers));

    }
}
