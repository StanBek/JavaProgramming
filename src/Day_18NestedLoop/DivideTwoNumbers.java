package Day_18NestedLoop;

public class DivideTwoNumbers {

    public static void main(String[] args) {

        int a = 30;//a = 30-7=23;23-7=16;16-7=9; 9-7=2
        int b = 7;

        int count = 0;//count = 1+1+1+1=4

        while (a>=b){
            a-=b;
            count++;
        }
        System.out.println(count+","+a);



    }
}
