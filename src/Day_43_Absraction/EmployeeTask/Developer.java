package Day_43_Absraction.EmployeeTask;

public final class Developer extends Employee{
    public Developer(String name, int age, int id, char gender, String jobTitle) {
        super(name, age, id, gender, jobTitle);
    }

    public void work() {
        System.out.println(getName()+" creating application");
    }

    public void sleep() {
        System.out.println(getName()+" sleeps 7 hours");
    }

    public void unitTest(){
        System.out.println(getName()+" making unit testing");
    }
}
