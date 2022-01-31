package Day_43_Absraction.EmployeeTask;

public final class Teacher extends Employee{
    public Teacher(String name, int age, int id, char gender, String jobTitle, double salary) {
        super(name, age, id, gender, jobTitle, salary);
    }

    public void work() {
        System.out.println(getAge()+" is teaching");
    }

    public void sleep() {
        System.out.println(getName()+" sleeping 9 hours");
    }
}
