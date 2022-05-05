import problemClass.Robot;
import problemClass.RobotUtils;
import problemClass.Warehouse;

public class Main {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse("alpina");

        for (int i = 0; i < 5; i++) {
            Robot newRobot = new Robot(RobotUtils.generarNombreRobot());

        }
    }
}
