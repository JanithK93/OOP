package AbstractPackage;

import OverridingPackage.Bike;

public class MainAbstract {


    public static void main(String args []){
        MotorBike hon = new Honda4();
        hon.run();
        hon.sound();
    }
}
