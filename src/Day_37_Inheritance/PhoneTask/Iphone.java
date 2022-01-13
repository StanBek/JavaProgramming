package Day_37_Inheritance.PhoneTask;

public class Iphone extends Phone {
    public Iphone(String model, String size, double price, String color) {
        super("Apple", model, size, price, color);
    }

        public void faceTime(long phoneNumber){
            System.out.println(brand+model+" has Face time");
        }

        public void faceTime(String email){
            System.out.println(brand+model+" has Face time");
        }


}
/*
 Variables:
                    brand, model, size, price, color

                Methods:

                    call(long phoneNumber)
                    text(long phoneNumber)
                    faceTime(long phoneNumber)
                    faceTime(String email)
                    toString()
 */