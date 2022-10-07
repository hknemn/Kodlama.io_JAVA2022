package hafta3.staticdemo;
//Java Dersi 45 : Composition - Inner Class ve Static

public class ProductManager {

    public void add(Product product) {
        if (ProductValidator.isValid(product)) {
            System.out.println("product added");
        } else {
            System.out.println("something went wrong");
        }
    }
}
