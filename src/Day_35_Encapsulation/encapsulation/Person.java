package Day_35_Encapsulation.encapsulation;

public class Person {

    private String name;
    private int age;

    public String getName(){//Getter method
        return name;
    }

    public void setName(String name){//Setter method
        this.name=name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<=0||age>=120){
            System.err.println("Invalid age: "+age);
            System.exit(0);
        }
        this.age=age;
    }
}
