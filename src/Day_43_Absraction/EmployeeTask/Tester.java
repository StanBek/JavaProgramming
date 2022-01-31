package Day_43_Absraction.EmployeeTask;

public final class Tester extends Employee{

    public Tester(String name, int age, int id, char gender, String jobTitle) {
        super(name, age, id, gender, jobTitle);
    }

    public void work() {
        System.out.println(getName()+" is testing the application");
    }


    public void sleep() {
        System.out.println(getName()+" sleeps 8 hours");
    }

    public void bugReport(){
        System.out.println(getName()+" is creating bug reports");
    }
}
