package hafta3.abstractclasses;
//Java Dersi 40 : Abstract Siniflarla Calismak

public abstract class GameCalculator {

    public abstract void hesapla();

    public final void gameOver() {
        System.out.println("game over!");
    }
}
