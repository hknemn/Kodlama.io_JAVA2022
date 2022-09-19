package hafta1;
//Java Dersi 17 : Stringlerle Calismak 1

public class StringMetotlari {

    public static void main(String[] args) {
        String mesaj = "Bugun hava cok guzel.";
        System.out.println(mesaj);

        System.out.println("eleman sayisi: " + mesaj.length());
        System.out.println("5.eleman: " + mesaj.charAt(4));
        System.out.println(mesaj.concat("yasasin!"));
        System.out.println(mesaj.startsWith("B"));
        System.out.println(mesaj.endsWith("."));
        char[] karakterler = new char[5];
        mesaj.getChars(0, 5, karakterler, 0);
        System.out.println(karakterler);
        System.out.println(mesaj.indexOf("av"));
        System.out.println(mesaj.lastIndexOf("a"));
    }
}
