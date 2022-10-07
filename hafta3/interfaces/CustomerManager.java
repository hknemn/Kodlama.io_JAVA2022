package hafta3.interfaces;
//Java Dersi 42 : Interfaceler ile Calismak
//Java Dersi 43 : Interface ile Polymorphism

public class CustomerManager {

    private ICustomerDal customerDal;

    public CustomerManager(ICustomerDal customerDal) {
        this.customerDal = customerDal;
    }

    public void add() {
        this.customerDal.add();
    }
}
