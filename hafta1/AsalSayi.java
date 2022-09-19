package hafta1;
//Java Dersi 19 : Mini Proje 1 - Sayi Asal mi?

public class AsalSayi {

    public static void main(String[] args) {
        int number = 2;
        int remainder = number % 2;
        boolean isPrime = true;

        if (number == 1) {
            System.out.println("asal degil");
        }
        if (number < 1) {
            System.out.println("gecersiz sayi");
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
            }
        }
        if (isPrime) {
            System.out.println("sayi asal");
        } else {
            System.out.println("sayi asal degil");
        }
    }
}
