package Day_34_CarbageCollection_AccessModifiers;

public class StaticBlock {

    public static void main(String[] args) {

        System.out.println("Main method");
    }

    static{//runs first before anythings, and only runs one time
        System.out.println("Static Block");
    }

}
