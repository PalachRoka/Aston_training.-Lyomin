public class ProductsArray {
    public static void main(String[] args) {
        Product[] productsArray = new Product[5];

        productsArray[0] = new Product("Samsung S25 Ultra", "01.02.2025",
                "Samsung Corp.", "Korea", 5599, true);
        productsArray[1] = new Product("Samsung Galaxy A56", "12.12.2024",
                "Samsung Corp.", "Korea", 5459, false);
        productsArray[2] = new Product("Samsung Galaxy Flip7", "25.12.2025",
                "Samsung Corp.", "Korea", 6699, true);
        productsArray[3] = new Product("Samsung Galaxy A16", "01.06.2025",
                "Samsung Corp.", "Korea", 899, true);
        productsArray[4] = new Product("Apple iPhone 17 Pro", "01.01.2025",
                "Nihaoma Corp.", "China", 99999, false);
        }
    }