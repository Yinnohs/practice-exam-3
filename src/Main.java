import factories.RobotFactory;
import problemClass.Product;
import problemClass.Robot;
import problemClass.RobotUtils;
import problemClass.Warehouse;

public class Main {
    public static void main(String[] args) {
        int MAX_ROBOTS = 5;
        Warehouse warehouse = new Warehouse("alpina");

        for (int i = 0; i < MAX_ROBOTS; i++) {
         warehouse.addRobot(RobotFactory.CreateRobot());
        }

        for (int i = 0; i < MAX_ROBOTS; i++) {
            Robot currentRobot = warehouse.dropRobot();
            System.out.println("robot number " + (i+1) );
            System.out.println("name: " + currentRobot.getName());
            System.out.println("products: \n");
            for (int j = 0; j < currentRobot.getMaxProducts(); j++) {
                System.out.println("product: " + (j + 1));
                System.out.println(currentRobot.unload().toString());
            }
            System.out.println(" ");
        }
    }
}
