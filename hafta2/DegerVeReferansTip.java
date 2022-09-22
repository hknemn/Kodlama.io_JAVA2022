package hafta2;
//Java Dersi 29 : Cok Onemli - Deger ve Referans Tipleri Anlamak

public class DegerVeReferansTip {

    public static void main(String[] args) {
        int sayi1 = 10;
        int sayi2 = 20;
        sayi2 = sayi1;
        sayi1 = 30;
        System.out.println(sayi2);

        int[] sayilar1 = {1, 2, 3};
        int[] sayilar2 = {4, 5, 6};
        sayilar2 = sayilar1;
        System.out.println(sayilar2[1]);
    }
}
