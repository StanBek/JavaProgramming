package Day_24_CustomMethod_Return;

public class ReturnMethodPractice {

    public static void main(String[]args){
        int maxNumber = max(100, 200);
        System.out.println(maxNumber);
        int multiplication= maxNumber*2;
    }
    public static int max(int a, int b){
        int result=0;
        if(a>b){
            result=a;
        }else{
            result=b;
        }
        return result;
    }



}