package Day_32_Constructors;

public class CarObjects {

    public static void main(String[] args) {

        Car car1=new Car("BMW");
        Car car2=new Car("Honda","Accord");
        Car car3=new Car("Lexus","RX350",2020);
        Car car4 = new Car("Volga","2410",1982,3000);
        Car car5 = new Car("BMW","X5",2020,75000,"Gray");

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);
    }
}
