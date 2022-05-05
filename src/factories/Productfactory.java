package factories;

import problemClass.Product;
import problemClass.RobotUtils;

public class Productfactory {

    private static final int  MAX_PRODUCT_PRICE = 20;
    public  static Product createProduct(){
        return new Product(RobotUtils.generarNombreProducto(), RobotUtils.generarNumeroAleatorio(MAX_PRODUCT_PRICE));
    }
}
