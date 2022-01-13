package Day_20_Arrays;
import java.util.Scanner;

public class test {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];
        for(int i=0; i < size; i++){
            nums[i] = scan.nextInt();
        }
        printUniqueNumbers(nums);
    }

    public static void printUniqueNumbers(int[] nums){
        //WRITE YOUR CODE HERE


        for (int k = 0; k < nums.length; k++) {

            int element=nums[k];//Java
            int frequency = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i]==element){
                    frequency++;
                }
            }
            if (frequency==1){
                System.out.print(element);
            }
        }
    }
}

