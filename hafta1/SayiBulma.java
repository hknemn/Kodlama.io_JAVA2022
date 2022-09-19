package hafta1;
//Java Dersi 23 : Mini Proje 5 - Sayi Bulma

public class SayiBulma {

    public static void main(String[] args) {
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
            System.out.println("sayi mevcuttur");
        } else {
            System.out.println("sayi mevcut degildir");
        }
    }
}
