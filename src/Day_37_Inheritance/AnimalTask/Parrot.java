package Day_37_Inheritance.AnimalTask;

public class Parrot extends Animal {


    public String parrotWingColor;

    public Parrot(String name, String breed, char gender, int age, String size, String color,String parrotWingColor) {
        super(name, breed, gender, age, size, color);
        this.parrotWingColor = parrotWingColor;
    }

    public void sing() {
        System.out.println(name + " is singing");
    }


    public static void main(String[] args) {
        Parrot parrot1 = new Parrot("Max", "Tyt", 'M', 3, "large", "white","black");
    }
}


