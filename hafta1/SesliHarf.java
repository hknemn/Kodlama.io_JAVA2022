package hafta1;
//Java Dersi 20 : Mini Proje 2 - Kalin Sesli ve Ince Sesli Harfler

public class SesliHarf {

    public static void main(String[] args) {
        char harf = 'E';

        switch (harf) {
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("kalin sesli");
                break;
            default:
                System.out.println("ince sesli");

        }
    }
}
