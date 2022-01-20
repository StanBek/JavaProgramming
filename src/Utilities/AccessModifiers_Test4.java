package Utilities;

import Day_40_FinalKeyword.ProtectedAccessModifier;

public class AccessModifiers_Test4 extends ProtectedAccessModifier {

    public static void main(String[] args) {

       // System.out.println(ProtectedAccessModifier.name1);//still not visible because its static
        System.out.println(ProtectedAccessModifier.name2);//protected its visible because its subclass


    }
}
