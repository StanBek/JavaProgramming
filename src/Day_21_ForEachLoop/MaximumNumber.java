package Day_21_ForEachLoop;

public class MaximumNumber {

    public static void main(String[] args) {

        int[] numbers = {10,5,4,20,1,0};
        int max = numbers[0];//10
        int min = numbers[0];
/*
        for (int i = 0; i < numbers.length; i++) {

            if(numbers[i]>max){//if there element in the array thats greater than the current max number
                max=numbers[i];//assigning greater number to variable max
            }

        }
        .......
 */
        for (int each:numbers){
            if (each>max){
                max=each;
            }
        }

        for (int each:numbers){
            if (each<min){
                min=each;
            }
        }

        System.out.println(max+" "+min);




    }
}
