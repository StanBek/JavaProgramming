package Day_43_Absraction.EmployeeTask;

import Day_20_Arrays.test;

public class EmployeeObject {

    public static void main(String[] args) {
        Tester tester = new Tester("Ali",30,25,'M',"SDET",145000.00);
        Developer developer = new Developer("Alex",28,24,'M',"Web Developer",155000.00);
        Teacher teacher = new Teacher("Angel",28,43,'F',"English Teacher",85000.00);
        Driver driver = new Driver("Jhon",34,45,'M',"Lyft Driver",75000.00);

        teacher.eat();
        teacher.getAge();
        tester.sleep();
    }
}
