package hafta2;
//Java Dersi 24 : Metotlari Anlamak

public class MetotlarGiris {

    public static void main(String[] args) {
        sayiBulmaca();
    }

    public static void sayiBulmaca() {
        int[] sayilar = {1, 2, 5, 7, 9, 0};
        int aranacak = 5;
        boolean varMi = false;

        for (int sayi : sayilar) {
            if (sayi == aranacak) {
                varMi = true;
                break;
            }
        }
        if (varMi) {
            mesajVer("sayi mevcuttur: " + aranacak);
        } else {
            mesajVer("sayi mevcut degildir: " + aranacak);
        }
    }

    public static void mesajVer(String mesaj) {
        System.out.println(mesaj);
    }
}
