package advanceDataTypes;

import java.util.ArrayList;

public class CustomQueue<T>{
    private ArrayList<T> values ;

    public CustomQueue() {
        this.values = new ArrayList<>();
    }

    public void enQueue (T element){
        this.values.add(element);
    }

    public T deQueue(){
        if (this.values.size() == 0){
            System.out.println("there is nothin in this queue");
            return null;
        }
        return this.values.remove(0);
    }
}

