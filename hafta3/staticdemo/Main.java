package hafta3.staticdemo;
//Java Dersi 45 : Composition - Inner Class ve Static

public class Main {

    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        Product product = new Product();
        product.price = 10;
        product.name = "asus";
        productManager.add(product);
    }
}
