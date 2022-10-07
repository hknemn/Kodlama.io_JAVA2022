package hafta3.overriding;
//Java Dersi 39 : Overriding Altyapisiyla Calismak

public class OgrenciKrediManager extends BaseKrediManager {

    public double hesapla(double tutar) {
        return tutar * 1.08;
    }
}
