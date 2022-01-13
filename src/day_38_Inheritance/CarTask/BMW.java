package day_38_Inheritance.CarTask;

public class BMW extends Car{
    public BMW(String brand, String model, int year, double price, String color, int miles) {
        super(brand, model, year, price, color, miles);
    }

    public void breakDown(){
        System.out.println(model+" "+brand+" is break down");
    }

    public void racing(){
        System.out.println(model+" and "+ brand+" is racing");
    }
}
