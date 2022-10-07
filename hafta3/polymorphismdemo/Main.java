package hafta3.polymorphismdemo;
//Java Dersi 38 : Gercek Hayatta Polimorfizm ile Calismak

public class Main {

    public static void main(String[] args) {
//        BaseLogger[] loggers = new BaseLogger[]{
//            new DatabaseLogger(),
//            new FileLogger(),
//            new EmailLogger(),
//            new ConsoleLogger()
//        };
//        
//        for (BaseLogger logger : loggers) {
//            logger.log("log message");
//        }
        CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
        customerManager.add();
    }
}
