package day_33_Static;

public class EmployeeObjects {

    public static void main(String[] args) {

        Employee employee1=new Employee();
        employee1.name="Ahmet";

        Employee employee2=new Employee();
        employee2.name="Stan";

        Employee employee3=new Employee();
        employee3.name="Bek";

        System.out.println(employee1.name);
        System.out.println(employee2.name);
        System.out.println(employee3.name);
    }
}
