package Day_32_Constructors.day_38_Inheritance;

import Day_32_Constructors.day_38_Inheritance.CarTask.BMW;
import Day_32_Constructors.day_38_Inheritance.CarTask.Tesla;
import Day_32_Constructors.day_38_Inheritance.CarTask.Toyota;

public class ParkingLot {

    public static void main(String[] args) {

        Toyota toyota = new Toyota("Camry",2020,20000,"Gray",123456);

        Tesla tesla = new Tesla("Model X",2021,65000,"Red",345);

        BMW bmw = new BMW("X7",2022,120000,"Black",0);

      toyota.start();
      tesla.start();
      bmw.start();
    }
}
