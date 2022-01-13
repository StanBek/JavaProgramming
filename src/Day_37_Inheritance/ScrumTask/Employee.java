package Day_37_Inheritance.ScrumTask;

public class Employee extends Person{
    public String jobTitle;
    public String companyName;
    public int id;
    public double salary;

    public Employee(String name, int age, char gender, String jobTitle,  int id, double salary, String companyName) {
        super(name, age, gender);
        this.jobTitle = jobTitle;
        this.companyName = companyName;
        this.id = id;
        this.salary = salary;
    }
    public void work(){
        System.out.println(name + "is working");
    }

    public String toString() {
        return "Employee{" +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", companyName='" + companyName + '\'' +
                ", id=" + id +
                ", salary=" + salary +

                '}';
    }
}
