package factories;

import problemClass.Product;
import problemClass.Robot;
import problemClass.RobotUtils;

public class RobotFactory {
    public static Robot CreateRobot(){
        int maxProducts = (int) RobotUtils.generarNumeroAleatorio(5);
        Robot robot = new Robot(RobotUtils.generarNombreRobot(), maxProducts);
        for (int i = 0; i < robot.getMaxProducts(); i++) {
            robot.load(Productfactory.createProduct());
        }

        return robot;

    }
}
