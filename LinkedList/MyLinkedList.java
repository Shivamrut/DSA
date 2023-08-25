

class MyLinkedList{
    private Node head;
    private int size;

    public MyLinkedList(){
        size=0;
    }

    public void add(int data){
        Node node = new Node();
        node.data = data;

        if(head==null){
            head = node;
            
        }
        else{
            Node temp = head;
            while(temp.next!= null){
                temp = temp.next;
            }
            temp.next = node;
        }
        size++;
    }

    public void add(int index,int data){
        Node node = new Node();
        node.data = data;
        Node temp = head;
        if(index>=size){
            System.out.println("Invalid index number");
        }
        else if(index==0){
            node.next = head;
            head = node;
            size++;
        }
        else {
            for(int i=0;i<index-1;i++){
                temp = temp.next;
            }
            node.next = temp.next;
            temp.next = node;
            size++;
        }
        
    }

    public void deleteAt(int index){
        if(index>=size){
            System.out.println("Invalid index number");
        }
        else if(index==0){
            head = head.next;
            size--;
        }
        else{
            Node temp = head;
            for(int i=0;i<index-1;i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
            size--;
        }
    }

    public void show(){
        Node temp = head;
        for(int i=0;i<size;i++){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public int size(){
        return size;
    }
}