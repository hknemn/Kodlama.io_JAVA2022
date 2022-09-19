package hafta1;
//Java Dersi 10 : Switch Bloklariyla Calismak

public class SwitchBloklari {

    public static void main(String[] args) {
        char grade = 'A';

        switch (grade) {
            case 'A':
                System.out.println("Mukemmel gectiniz");
                break;
            case 'B':
                System.out.println("Cok guzel gectiniz");
                break;
            case 'C':
                System.out.println("Iyi gectiniz");
                break;
            case 'D':
                System.out.println("Fena degil gectiniz");
                break;
            case 'F':
                System.out.println("Maalesef kaldiniz");
                break;
            default:
                System.out.println("Gecersiz not girdiniz");
        }
    }
}
