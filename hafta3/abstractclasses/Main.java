package hafta3.abstractclasses;
//Java Dersi 40 : Abstract Siniflarla Calismak

public class Main {

    public static void main(String[] args) {
        WomanGameCalculater womanGameCalculater = new WomanGameCalculater();
        womanGameCalculater.hesapla();
        womanGameCalculater.gameOver();
        
        GameCalculator gameCalculator = new ManGameCalculater();
    }
}
