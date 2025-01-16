package org.example.model;

public class Store {

    public static void main(String[] args) {
        // Ürünleri oluşturuyoruz
        ProductForSale[] products = new ProductForSale[3];

        products[0] = new Chocolate("Chocolate", 10, "Dark chocolate with high cocoa content");
        products[1] = new Coke("Coke", 2, "Refreshing cola drink" );
        products[2] = new Bread("Bread", 1, "Whole grain bread");

        // Ürünleri listelemek için listProducts metodunu çağırıyoruz
        listProducts(products);
    }

    public static void listProducts(ProductForSale[] products) {
        // Her ürünün detaylarını göstermek için showDetails metodunu çağırıyoruz
        for (ProductForSale product : products) {
            product.showDetails();
            System.out.println("---------------------------"); // Ürünler arasında ayrım için
        }
    }
}
