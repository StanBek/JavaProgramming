package Day_30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CarObjects {
    public static void main(String[] args) {

        Car car1=new Car();
        car1.setInfo("Toyota","Camry","Green",2021,35000);
        System.out.println(car1);

        Car car2 = new Car();
        car2.setInfo("BMW","X5","Blue",2020, 45000);
        System.out.println(car2);

        Car car3 = new Car();
        car3.setInfo("Volga","2410","WetAsphalt",1988, 5000);
        car3.stop();
        System.out.println(car3);

        //Car[]cars={car1,car2,car3};

        ArrayList<Car> carList = new ArrayList<>();
        carList.addAll(Arrays.asList(car1,car2,car3));

        for(Car each:carList){
            System.out.println(each.brand+" : "+each.price);
        }

        System.out.println("=========================================");

        /*
        BMW:    2005-2008
        Toyota: 1995-1997
         */
        carList.removeIf(n-> n.brand.equals("BMW")&&n.year>=2005&&n.year<=2008);
        carList.removeIf(n-> n.brand.equals("Toyota")&&n.year>=1995&&n.year<=1997);


    }
}
