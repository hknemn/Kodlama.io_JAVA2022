package hafta3.interfaces;
//Java Dersi 42 : Interfaceler ile Calismak
//Java Dersi 43 : Interface ile Polymorphism

public class MySqlCustomerDal implements ICustomerDal, IRepository {

    public void add() {
        System.out.println("MySql added");
    }

}
