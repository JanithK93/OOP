package OverridingPackage;

public class MainOverride {
    //Bike b = new Bike();
    // Vehicle v = new Vehicle();

    public static void main(String [] args){
        Bike b = new Bike();
        Vehicle v = new Vehicle();

        b.Run();
        v.Run();
    }
}
