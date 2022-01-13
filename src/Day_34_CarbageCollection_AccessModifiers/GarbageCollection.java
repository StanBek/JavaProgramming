package Day_34_CarbageCollection_AccessModifiers;

import Day_30_CustomClass.Car;
import Day_30_CustomClass.Dog;
import Day_30_CustomClass.Student;

import java.util.ArrayList;
import java.util.Arrays;

public class GarbageCollection {

    public static void main(String[] args) {
        /*
        //new GarbageCollection().finalize();

        String str = null; // null keyword only for nonPrimitive datatype;
        System.out.println(str.toUpperCase());
        ...
         */

   String str = "Wooden Spoon";//after line 15, "Wooden Spoon" will be eligible for garbage collection
        str=null;
        System.out.println(str);

       // Car car1= new Car("Toyota");
      //  car1=null;

       // System.out.println(car1);

        System.out.println("====================================");

        Dog dog1= new Dog();

        dog1.name="Lucy";

       dog1= new Dog();
        dog1.name="Max";
        System.out.println(dog1);

        String language = "Python";
               language=  "Java";

        System.out.println("=================================");

        ArrayList<Integer> list1=new ArrayList<>();
        list1.add(100);
        ArrayList<Integer> list2=list1;
        list2.addAll(Arrays.asList(200,300,400));

        System.out.println(list1);
        System.out.println(list2);

        System.out.println(list1==list2);

        System.out.println("====================================");




    }
}
