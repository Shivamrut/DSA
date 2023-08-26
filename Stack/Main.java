
public class Main{
    public static void main(String[] args) {
        // Stack stack = new Stack();
        // stack.push(15);
        // stack.push(20);
        // stack.push(30);
        // while(stack.hasNext()){
        //     System.out.println(stack.pop());
        // }

        ArrayListStack stack = new ArrayListStack();
        stack.push(10);
        stack.push(30);
        stack.push(60);
        stack.push(120);
        stack.push(240);
        
        System.out.println(stack.top());
        System.out.println(stack.pop());

        while(stack.hasNext()){
            System.out.print(stack.pop() + " ");
        }

        stack.clearStack();
        stack.push(1);
        while(stack.hasNext()){
            System.out.print(stack.pop() + " ");
        }
    }
}