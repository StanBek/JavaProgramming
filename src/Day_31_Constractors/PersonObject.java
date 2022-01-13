package Day_31_Constractors;

public class PersonObject {

    public static void main(String[] args) {

        Person person1 = new Person("Stan",'M',39);

        Person person2 = new Person("Meerim",'F',31);
        person2.age=28;

        System.out.println(person1);
        System.out.println(person2);


    }
}
