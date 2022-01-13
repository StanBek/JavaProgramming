package Day_34_CarbageCollection_AccessModifiers;

public class AccessModifiersTest {
    public static void main(String[] args) {

        System.out.println(AccessModifiers.publicDate);
        System.out.println(AccessModifiers.defaultData);
        //System.out.println(AccessModifiers.privateDate); privateData is not teachable in different class;

        AccessModifiers.method1();
        AccessModifiers.method2();
        //AccessModifiers.method3();privateData is not teachable in different class;

    }
}
