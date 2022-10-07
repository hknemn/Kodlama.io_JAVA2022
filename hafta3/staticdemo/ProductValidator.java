package hafta3.staticdemo;
//Java Dersi 45 : Composition - Inner Class ve Static

public class ProductValidator {

    public static boolean isValid(Product product) {
        if (product.price > 0 && !product.name.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}
