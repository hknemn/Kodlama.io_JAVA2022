package hafta1;
//Java Dersi 21 : Mini Proje 3 - Mukemmel Sayilar

public class MukemmelSayi {

    public static void main(String[] args) {
        int number = 28;
        int total = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                total += i;
            }
        }

        if (total == number) {
            System.out.println("mukemmel sayi");
        } else {
            System.out.println("mukemmel sayi degil");
        }
    }
}
