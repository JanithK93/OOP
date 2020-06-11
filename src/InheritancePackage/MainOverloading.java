package InheritancePackage;

public class MainOverloading {


    public static void main(String args[]) {
        AddOverloading adder1= new AddOverloading();

        //System.out.println(AddOverloading.Adder(4,5));
        //System.out.println(AddOverloading.Adder(1,3,5));
        System.out.println(adder1.Adder(2,3,4));
        System.out.println(adder1.Adder(5,6));
    }

}
