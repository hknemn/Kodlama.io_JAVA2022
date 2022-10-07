package hafta3.overriding;
//Java Dersi 39 : Overriding Altyapisiyla Calismak

public class Main {

    public static void main(String[] args) {
        BaseKrediManager[] krediler = new BaseKrediManager[]{
            new OgretmenKrediManager(),
            new TarimKrediManager(),
            new OgrenciKrediManager()
        };
        for (BaseKrediManager kredi : krediler) {
            System.out.println(kredi.hesapla(1000));
        }
    }
}
