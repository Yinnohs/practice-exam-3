package problemClass;

public class Product {
    private String name;
    private Double price;

    public Product(String name, Double price){
        this.name = name;
        this.price = Math.round(price * 100.0) / 100.0;
    }

    @Override
    public String toString(){
        return "name: " + this.name + "\n"+
                "price: " + this.price + "\n";
    }

}
