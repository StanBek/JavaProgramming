package day_38_Inheritance.CarTask;

public class BMW extends Car{
    public BMW( String model, int year, double price, String color, int miles) {
        super("BMW", model, year, price, color, miles);
    }

    public void breakDown(){
        System.out.println(model+" "+brand+" is break down");
    }

    public void racing(){
        System.out.println(model+" and "+ brand+" is racing");
    }

    @Override
    public void start() {
        System.out.println("Call mechanic and use jump start for start this "+brand+" "+model);
    }
}
