package hafta2;
//Java Dersi 26 : Variable Arguments ile Calismak

public class VariableArguments {

    public static void main(String[] args) {
        System.out.println(topla(2, 3, 4, 5, 6));
    }

    public static int topla(int... sayilar) {
        int toplam = 0;
        for (int sayi : sayilar) {
            toplam += sayi;
        }
        return toplam;
    }
}
