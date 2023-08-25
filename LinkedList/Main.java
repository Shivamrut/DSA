public class Main {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.add(10);
        list.add(50);
        list.add(0);
        list.add(99);
        list.add(2,44);
        list.add(1,11);
        list.add(0,999);
        list.deleteAt(0);
        list.deleteAt(2);
        list.deleteAt(list.size()-1);
        list.show();
        System.out.println(list.size());
    }
}
