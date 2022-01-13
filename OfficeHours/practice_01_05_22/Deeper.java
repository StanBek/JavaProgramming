package practice_01_05_22;



public class Deeper {
    public static void main(String[] args) {
        System.out.println("Not deep");//1 print
        deep();
        System.out.println("Not deep");//5 print
    }

    public static void deep(){
        System.out.println("Deep");//2 print
        deeper();
        System.out.println("Deep");//4 print
    }

    public static void deeper(){
        System.out.println("Deeper");//3 print
    }

}
