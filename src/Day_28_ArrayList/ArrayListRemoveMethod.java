package Day_28_ArrayList;

import java.util.ArrayList;

public class ArrayListRemoveMethod {
    public static void main(String[] args) {


        ArrayList<String> employees = new ArrayList<>();

        employees.add("Stan");
        employees.add("Mery");
        employees.add("Adika");
        employees.add("Tim");
        employees.add("Nurdin");
        employees.add("Alina");
        employees.add("Ayday");

        System.out.println(employees);

        employees.remove(0);

        System.out.println(employees);

    employees.remove(employees.size()-1);

        System.out.println(employees);

        employees.remove("Alina");
        System.out.println(employees);
    }

}
