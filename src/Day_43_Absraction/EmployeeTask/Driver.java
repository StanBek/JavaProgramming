package Day_43_Absraction.EmployeeTask;

public final class Driver extends Employee{
    public Driver(String name, int age, int id, char gender, String jobTitle) {
        super(name, age, id, gender, jobTitle);
    }

    public void work() {
        System.out.println(getName()+" driving truck");
    }

    public void sleep() {
        System.out.println(getName()+" must sleep 10 hours");
    }
}
