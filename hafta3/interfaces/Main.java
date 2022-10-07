package hafta3.interfaces;
//Java Dersi 42 : Interfaceler ile Calismak
//Java Dersi 43 : Interface ile Polymorphism

public class Main {

    public static void main(String[] args) {
        //ICustomerDal customerDal = new OracleCustomerDal();
        CustomerManager customerManager = new CustomerManager(new MySqlCustomerDal());
        customerManager.add();
    }
}
