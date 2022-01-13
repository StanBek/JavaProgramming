package Day_37_Inheritance.ScrumTask;

public class ScrumMaster extends Employee {
    public ScrumMaster(String name, int age, char gender,  int id, double salary,String companyName) {
        super(name, age, gender, "Scrum Muster",  id, salary,companyName);
    }

    public void facilitate() {
        System.out.println(jobTitle + " " + name + " is facilitating ");
    }

    public void removesImpediments() {
        System.out.println(jobTitle + " " + name + " is removing Impediments");
    }

    public void improvesTheUseOfScrum() {
        System.out.println(jobTitle + " " + name + " is improving the use of scrum");
    }
}