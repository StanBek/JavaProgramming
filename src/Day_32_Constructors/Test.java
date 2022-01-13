package Day_32_Constructors;

public class Test {

    public Test(){
        System.out.println("A");
    }
    public Test(int a){//print A B
        this();
        System.out.println("B");
    }
    public Test(double a){//print A B C
        this(10);
        System.out.println("C");
    }
    public Test(String str){
        this(2.5);
        System.out.println("D");
    }

    public static void main(String[] args) {
        new Test("Java");
    }


}
