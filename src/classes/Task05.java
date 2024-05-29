package classes;

import java.util.ArrayList;
import java.util.List;

public class Task05 {
    public static void main(String[] args) {
        Storage storage = new Storage(100);

        Storage.Product apple = new Storage.Product("Apple", 1.5, 20);
        Storage.Product banana = new Storage.Product("Banana", 0.5, 50);

        storage.addProduct(apple);
        storage.addProduct(banana);

        System.out.println("Products in storage:");
        for (Storage.Product product : storage.getProducts()) {
            System.out.println("Name: " + product.getName() + ", Price: " + product.getPrice() + ", Quantity: " + product.getQuantity());
        }

        System.out.println("Total cost of products: " + storage.getTotalCost());
        System.out.println("Remaining capacity: " + storage.getCapacity());
    }

    private static class Storage {
        private double capacity;
        private List<Product> storage;
        private double totalCost;

        public Storage(int capacity) {
            this.capacity = capacity;
            this.storage = new ArrayList<>();
            this.totalCost = 0;
        }

        public void addProduct(Product product) {
            if (this.capacity >= product.getQuantity()) {
                this.storage.add(product);
                this.capacity -= product.getQuantity();
                this.totalCost += product.getTotalCost();
            } else {
                System.out.println("Not enough capacity to add this product.");
            }
        }

        public List<Product> getProducts() {
            return new ArrayList<>(storage);
        }

        public double getCapacity() {
            return capacity;
        }

        public double getTotalCost() {
            return totalCost;
        }

        private static class Product {
            private String name;
            private double price;
            private int quantity;

            public Product(String name, double price, int quantity) {
                this.name = name;
                this.price = price;
                this.quantity = quantity;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public double getPrice() {
                return price;
            }

            public void setPrice(double price) {
                this.price = price;
            }

            public int getQuantity() {
                return quantity;
            }

            public void setQuantity(int quantity) {
                this.quantity = quantity;
            }

            public double getTotalCost() {
                return this.price * this.quantity;
            }
        }
    }
}