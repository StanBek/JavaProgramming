package Day_39_Recap.CydeoTask;

public class Cydeo {

    public static void main(String[] args) {

        Developer developer = new Developer("Stan", 39, 'M', 1982, "SDET", 150000);

        System.out.println(developer);

        developer.setSalary(200000);

        Tester tester = new Tester("Olga",27,'F',4,"QA",110000);

        Teacher teacher = new Teacher("Daniel",29,'M',23,"SDET",100000);

        Student student=new Student("Suhaib",30,'M',234,"SDET");

        System.out.println(developer);
        System.out.println(teacher);
        System.out.println(teacher);
        System.out.println(student);
    }
}
