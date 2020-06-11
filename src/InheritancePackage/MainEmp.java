package InheritancePackage;

public class MainEmp {

    int id;
    String name;
    Address address;

    public MainEmp(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address=address;
    }

    void display(){
        System.out.println(id+" "+name);
        System.out.println(address.city+" "+address.state+" "+address.country);
    }

    public static void main(String[] args) {
        Address address1=new Address("gzb","UP","india");
        Address address2=new Address("gno","UP","india");

        MainEmp e=new MainEmp(111,"varun",address1);
        MainEmp e2=new MainEmp(112,"arun",address2);

        e.display();
        e2.display();

    }
}
