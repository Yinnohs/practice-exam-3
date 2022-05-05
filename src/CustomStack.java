import java.util.ArrayList;

public class CustomStack<T>{
    private ArrayList<T> values;

    public CustomStack(){
        this.values = new ArrayList<>();
    }

    public void push (T element){
        this.values.add(element);
    }

    public  T pop (T element){
        return this.values.remove(this.values.size() -1);
    }
}
