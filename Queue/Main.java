public class Main{
    public static void main(String[] args) {
        // Queue queue = new Queue();
        // queue.add(10);
        // queue.add(20);
        // queue.add(40);
        // queue.add(99);
        // while(queue.hasNext()){
        //     System.out.print(queue.remove() + " ");
        // }
            ArrayListQueue queue = new ArrayListQueue();
            queue.add(10);
            queue.add(20);
            queue.add(30);
            queue.add(40);
            queue.add(50);
            while(queue.hasNext()){
            System.out.print(queue.remove() + " ");
        }
    }
}