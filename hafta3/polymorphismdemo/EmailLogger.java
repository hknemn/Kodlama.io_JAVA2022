package hafta3.polymorphismdemo;
//Java Dersi 38 : Gercek Hayatta Polimorfizm ile Calismak

public class EmailLogger extends BaseLogger {

    public void log(String message) {
        System.out.println("email logger: " + message);
    }
}
