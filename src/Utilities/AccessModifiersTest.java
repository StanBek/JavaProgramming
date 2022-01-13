package Utilities;

import Day_34_CarbageCollection_AccessModifiers.AccessModifiers;

public class AccessModifiersTest {

    public static void main(String[] args) {

        System.out.println(AccessModifiers.publicDate);
        //System.out.println(AccessModifiers.defaultData); is not reachable in different package;
        //System.out.println(AccessModifiers.privateDate); privateData is not teachable in different class;


        AccessModifiers.method1();
        //AccessModifiers.method2();is not reachable in different package;
        //AccessModifiers.method3();privateData is not teachable in different class;

    }
}

class D{

}