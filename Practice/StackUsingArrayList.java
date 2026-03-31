package Practice;

import java.util.ArrayList;

class StackUsingArrayList {

    private ArrayList<Integer> stack;

    // Constructor
    public StackUsingArrayList() {
        stack = new ArrayList<>();
    }

    // PUSH
    public void push(int x) {
        stack.add(x);
    }

    // POP
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return stack.remove(stack.size() - 1);
    }

    // PEEK
    public int peek() {
        if (isEmpty()) {
            return -1;
        }
        return stack.get(stack.size() - 1);
    }

    // isEmpty
    public boolean isEmpty() {
        return stack.size() == 0;
    }

    // SIZE
    public int size() {
        return stack.size();
    }

    // MAIN METHOD
    public static void main(String[] args) {

        StackUsingArrayList s = new StackUsingArrayList();

        s.push(10);
        s.push(20);
        s.push(30);

        System.out.println("Top element: " + s.peek()); // 30
        System.out.println("Popped: " + s.pop());       // 30
        System.out.println("Size: " + s.size());        // 2
        System.out.println("Popped: " + s.pop());       // 20
        System.out.println("Is Empty: " + s.isEmpty()); // false
    }
}
