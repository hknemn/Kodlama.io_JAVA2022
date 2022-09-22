package hafta2.methodoverloading;
//Java Dersi 35 : Method Overloading ile Calismak

public class Main {

    public static void main(String[] args) {
        DortIslem dortIslem = new DortIslem();
        System.out.println(dortIslem.topla(2, 3));
        dortIslem.topla(2, 3, 5);
    }
}
