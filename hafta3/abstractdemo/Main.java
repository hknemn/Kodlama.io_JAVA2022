package hafta3.abstractdemo;
//Java Dersi 41 : Demo - Abstract Siniflari Pekistirmek

public class Main {

    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager(new MySqlDatabaseManager());
        customerManager.getCustomers();
    }
}
