package Day_43_Absraction.car;

public class CarShop {
    public static void main(String[] args) {


        //  Car car =new car ("Cydeo","Batch25","Gray",2020,100); we can not create object from Car class, because Car class its abstract class

        Honda honda = new Honda("Civic", "Black", 1996, 5000);

        Tesla tesla = new Tesla("model3", "white", 2020, 55555);

        Audi audi = new Audi("Q7", "Blue", 2021, 70000);


        System.out.println(honda);
        System.out.println(tesla);
        System.out.println(audi);

        System.out.println("==================================================");
        honda.setColor("red");
        audi.setColor("pink");
        tesla.setColor("green");
        System.out.println(honda);
        System.out.println(tesla);
        System.out.println(audi);

        honda.start();
    }
}
