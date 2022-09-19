package hafta1;
//Java Dersi 18 : Stringlerle Calismak 2

public class StringMetotlari2 {

    public static void main(String[] args) {
        String mesaj = "Bugun hava cok guzel.";
        System.out.println(mesaj);

        String yeniMesaj = mesaj.replace(' ', '-');
        System.out.println(yeniMesaj);
        System.out.println(mesaj.substring(2, 5));

        for (String kelime : mesaj.split(" ")) {
            System.out.println(kelime);
        }

        System.out.println(mesaj.toLowerCase());
        System.out.println(mesaj.toUpperCase());
        System.out.println(mesaj.trim());
    }
}
