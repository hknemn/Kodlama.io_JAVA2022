package hafta1;
//Java Dersi 15 : ReCap Demo 2 - Dizilerle Calismak

public class DizilerDemo {

    public static void main(String[] args) {
        double[] myList = {1.2, 6.3, 4.3, 5.6};
        double total = 0;
        double max = myList[0];
        for (double number : myList) {
            if (max < number) {
                max = number;
            }
            total += number;
            System.out.println(number);
        }
        System.out.println("toplam: " + total);
        System.out.println("en buyuk: " + max);
    }
}
