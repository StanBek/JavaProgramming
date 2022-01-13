package Day_35_Encapsulation.encapsulation;

public class EmployeeObject {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Stan", 'M', 39, 150000);
        employee1.setAge(32);

        System.out.println(employee1);

        Employee employee2=new Employee("Bek",'M',40,160000);
        employee2.setName("Elvira");
        employee2.setSalary(employee2.getSalary()+15000);
        System.out.println(employee2);
    }
}
