package hafta2.classesattributes;
//Java Dersi 31 : Field ve Attribute ile Calismak
//Java Dersi 32 : Encapsulation Ihtiyacini Anlamak
//Java Dersi 33 : Getter ve Setter ile Calismak
//Java Dersi 34 : Constructor ile Calismak

public class Main {

    public static void main(String[] args) {
        /*
        Product product = new Product();
        product.name = "Laptop";
        product.setId(1);
        product.description = "Asus Laptop";
        product.price = 5000;
        product.stockAmount = 3;
         */
        
        /*
        Product product = new Product();
        product.setName("Laptop");
        product.setId(1);
        product.setDescription("Asus Laptop");
        product.setPrice(2000);
        product.setStockAmount(3);
         */

        Product product = new Product(1, "laptop", "asus", 5000, 3, "red");

        ProductManager productManager = new ProductManager();
        productManager.add(product);

        System.out.println(product.getKod());
    }
}
