package problemClass;

import advanceDataTypes.CustomQueue;

public class Warehouse {
    private String name;
    private CustomQueue<Robot> queue;

    public Warehouse(String name) {
        this.name = name;
        this.queue = new CustomQueue<>();
    }


}
