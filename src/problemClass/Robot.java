package problemClass;

import advanceDataTypes.CustomStack;

public class Robot {
    private String name;
    private CustomStack<Product> products;

    public Robot(String name) {
        this.name = name;
        this.products = new CustomStack<>();
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
