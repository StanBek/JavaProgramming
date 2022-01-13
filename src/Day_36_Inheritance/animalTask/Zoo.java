package Day_36_Inheritance.animalTask;

public class Zoo {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setInfo("max", "Hasky",'M',3,"large","brown");

        dog.eat();
        dog.drink();
        dog.sleep();
        dog.move();
        dog.bark();
        //dog.hunt()

        Cat cat = new Cat();
        cat.setInfo("Fistik","outside cat",'M',3,"Small","orange");
        cat.eat();
        cat.drink();
        cat.sleep();
        cat.move();
        //cat.bark
        cat.scratch();


        Tiger tiger = new Tiger();
        tiger.setInfo("Leo", "Russian tabby", 'M', 1, "small", "gray");

        tiger.eat();
        tiger.drink();
        tiger.sleep();
        tiger.move();
        tiger.hunt();
        tiger.roar();
        //tiger.bark();

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(tiger);
    }
}
