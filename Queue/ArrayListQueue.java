import java.util.ArrayList;
import java.util.NoSuchElementException;

public class ArrayListQueue {
    private int size;
    private ArrayList<Integer> queue = new ArrayList<Integer>();

    public ArrayListQueue(){
        size = 0;
    }

    public void add(int data){
        queue.add(data);
        size++;
    }

    public boolean hasNext(){
        return size>0;
    }

    public int peek(){
        if(this.hasNext()){
            return queue.get(0);
        }
        else throw new NoSuchElementException("Queue is empty");
        
    }
    public int remove(){
        if(this.hasNext()){
            int data = queue.get(0);
            queue.remove(0);
            size--;
            return data;
        }
        else throw new NoSuchElementException("Queue is empty");
        
    }

    public void clearQueue(){
        queue.clear();
    }

    public int size(){
        return size;
    }
}
