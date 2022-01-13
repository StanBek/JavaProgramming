package Day_35_Encapsulation.encapsulation;

public class PersonObjects {

    public static void main(String[] args) {

        Person p1= new Person();
        //p1.name="Daniel";
        //p1.age=28;

        p1.setName("Daniel");
        p1.setAge(119);

        System.out.println(p1.getName()+" : "+p1.getAge());



    }
}
