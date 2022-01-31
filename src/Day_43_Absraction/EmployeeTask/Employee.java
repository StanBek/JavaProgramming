package Day_43_Absraction.EmployeeTask;

public abstract class Employee extends Person {

    private final int id;
    private String jobTitle;
    private double salary;

    public Employee(String name, int age, int id, char gender,  String jobTitle) {
        super(name, age, gender);
        if(id<=0){
            throw new RuntimeException("id can not be zero or negative number");
        }
        this.id = id;
        setJobTitle(jobTitle);
        setSalary(salary);
    }

    public int getId() {
        return id;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public abstract void work();

    @Override
    public String toString() {
        return "Employee{" +
                "name=" + getName() +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                ", id=" + id +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
