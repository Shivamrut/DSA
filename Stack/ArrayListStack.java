import java.util.ArrayList;
import java.util.EmptyStackException;

import javax.lang.model.type.NullType;

public class ArrayListStack {

    private ArrayList<Integer> stack = new ArrayList<Integer>();
    private int size;

    ArrayListStack(){
        
        size = 0;
    }

    public void push(int data){
        stack.add(data);
        size++;
    
    }

    public int pop(){
        if(this.hasNext()){
            int data = stack.get(size-1);
            stack.remove(size-1);
            size--;
            
            return data;
        }
        else throw new EmptyStackException();
    }

    public boolean hasNext(){
        return size>0;
    }

    public int top(){

        if(this.hasNext())
            return stack.get(size-1);
        else throw new EmptyStackException();
    }

    public int size(){
        return size;
    }

    public void clearStack(){
        stack.clear();
    }
}
