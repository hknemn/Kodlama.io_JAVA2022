package hafta2.inheritancedemo;
//Java Dersi 37 : Onemli - Inheritance Demo

public class Main {

    public static void main(String[] args) {
        KrediUI krediUI = new KrediUI();
        krediUI.krediHesapla(new OgretmenKrediManager());
    }
}
