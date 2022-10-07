package hafta3.abstractdemo;
//Java Dersi 41 : Demo - Abstract Siniflari Pekistirmek

public class CustomerManager {

    BaseDatabaseManager database;

    public CustomerManager(BaseDatabaseManager database) {
        this.database = database;
    }

    public void getCustomers() {
        this.database.getData();
    }
}
