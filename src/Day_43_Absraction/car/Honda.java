package Day_43_Absraction.car;

public class Honda extends Car{
    public Honda( String model, String color, int year, double price) {
        super("Honda", model, color, year, price);
    }

    @Override
    public void start() {
        System.out.println("twist your key");
    }
    public void stop(){
        System.out.println("Stop random");
    }
}
