package Day_20_Arrays;

public class MinNumOfArray {

    public static void main(String[] args) {

        int[] numbers = {100,500,30,50,40,2,90};

        int min=numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]<min){
                min=numbers[i];
            }

        }
        System.out.println(min);


    }
}
