package Day_37_Inheritance.PhoneTask;

public class PhoneShop {

    public static void main(String[] args) {

        Iphone iphone=new Iphone("10","medium",980.00,"Blue");

        iphone.call(6584838);
        iphone.text(8684838);

        System.out.println(iphone);

        System.out.println("=======================");

        Samsung samsung = new Samsung("galaxy","6 inches",900,"white");

        Nokia nokia = new Nokia("Brick", "4 inches", 300,"Gray");

        System.out.println(samsung);
        System.out.println(nokia);



    }
}
