package hafta3.polymorphismdemo;
//Java Dersi 38 : Gercek Hayatta Polimorfizm ile Calismak

public class CustomerManager {

    private BaseLogger logger;

    public CustomerManager(BaseLogger logger) {
        this.logger = logger;
    }

    public void add() {
        System.out.println("added");
        this.logger.log("log message");
    }
}
