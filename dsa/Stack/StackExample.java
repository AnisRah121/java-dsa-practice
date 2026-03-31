package Stack;
import  java.util.Stack;
public class StackExample {
    static void main() {
       Stack s = new Stack();
       s.push(10);
       s.push(20);
       s.push(30);
       s.push(40);
       s.push(50);
       s.push(60);
       s.push(70);
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.peek());
        System.out.println(s.isEmpty());
        System.out.println(s.size());

       while( !s.isEmpty())
       {
            System.out.println(s.pop());
       }
        System.out.println(s.size());
        System.out.println(s.isEmpty());
    }
}
