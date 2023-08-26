
public class Stack {

    private class Node {
        int data;
        Node next;
        public Node(){
            data = 0;
            next = null;
        }
    }

    public static class StackException extends Exception{
        public StackException(String s){
            super(s);
        }
    }

    private Node head;
    private int size;

    Stack(){
        size=0;
    }

    public void push(int i) {
        Node node = new Node();
        node.data = i;
        
        if(head==null){
            
            head = node;
            
        }
        else{
            node.next = head;
            head = node;
        }
        size++;
    }
    public int pop() throws StackException {
        if(head!=null){

            int data = head.data;
            head = head.next;
            size--;
            return data;
        }
        else throw new StackException("Stack is Empty");
        
    }
    public int top() throws StackException{
        if(head!=null)return head.data;
        else {
            throw new StackException("Empty stack");
        }
    }

    public Boolean hasNext(){
        if(size==0)return false;
        else return true;
    }

    public void clearStack(){
        head = null;
        size=0;
    }
    public int size(){
        return size;
    }
    
}
