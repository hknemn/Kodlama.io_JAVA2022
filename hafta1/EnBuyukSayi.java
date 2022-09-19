package hafta1;
//Java Dersi 9 : ReCap Demo 1 En Buyuk Sayi Hangisi

public class EnBuyukSayi {

    public static void main(String[] args) {
        int sayi1 = 24;
        int sayi2 = 25;
        int sayi3 = 2;
        int enBuyuk = sayi1;

        if (enBuyuk < sayi2) {
            enBuyuk = sayi2;
        }
        if (enBuyuk < sayi3) {
            enBuyuk = sayi3;
        }

        System.out.println("en buyuk: " + enBuyuk);
    }
}
