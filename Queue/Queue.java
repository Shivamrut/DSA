import java.util.NoSuchElementException;

public class Queue {

    private class Node{
        int data;
        Node next;
        public Node(){
            data = 0;
            next = null;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public Queue(){
        size = 0;
        head = null;
    }

    public void add(int data){
        Node node = new Node();
        node.data = data;

        if(head == null){
            head = node;
            tail = node;
        }
        else{
            tail.next = node;
            tail = tail.next;
        }
        size++;
    }

    public int peek()
    {
        if(size>0){
            return head.data;
        }
        else{
            throw new NoSuchElementException("Queue is empty");
        }
    }

    public int remove(){
        if(size>0){
            int data = head.data;
            head = head.next;
            size--;
            if(size==0)tail=null;
            return data;
        }
        else{
            throw new NoSuchElementException( "Queue is empty");
        }
    }
    public int size(){
        return size;
    }

    public boolean hasNext(){
        return size>0;
    }

}
