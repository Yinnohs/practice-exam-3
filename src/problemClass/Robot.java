package problemClass;

import advanceDataTypes.CustomStack;

public class Robot {
    private String name;
    private CustomStack<Product> products;

    private int maxProducts;

    public Robot(String name, int maxProducts) {
        this.name = name;
        this.products = new CustomStack<>();
        this.maxProducts = maxProducts;
    }

    public int getMaxProducts() {
        return maxProducts;
    }

    public String getName() {
        return name;
    }

    public Product unload() {
        return this.products.pop();
    }

    public  void  load(Product element){
        this.products.push(element);
    }
}
