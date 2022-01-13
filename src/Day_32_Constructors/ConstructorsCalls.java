package Day_32_Constructors;

public class ConstructorsCalls {

    public ConstructorsCalls(){
        System.out.println("Default constructor");
    }

    public ConstructorsCalls(int a){
        this();
        System.out.println("Constructors with int argument");
    }

    public ConstructorsCalls(String str){
        this(10);
        System.out.println("Constructors with String argument");
    }

    public static void main(String[] args) {
        ConstructorsCalls obj1=new ConstructorsCalls();
        System.out.println("===============================");

        ConstructorsCalls obj2 = new ConstructorsCalls(10);
        System.out.println("================================");

        ConstructorsCalls obj3=new ConstructorsCalls("Java");

    }

}
