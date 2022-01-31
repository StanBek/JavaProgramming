package Day_43_Absraction.EmployeeTask;

public class Teacher extends Employee{
    public Teacher(String name, int age, int id, char gender, String jobTitle) {
        super(name, age, id, gender, jobTitle);
    }

    public void work() {
        System.out.println(getAge()+" is teaching");
    }

    public void sleep() {
        System.out.println(getName()+" sleeping 9 hours");
    }
}
