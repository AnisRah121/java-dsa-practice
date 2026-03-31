package DoublyLinkedList;

import java.util.Arrays;

public class Demo {
    static void main() {
        DoublyLinkedList l = new DoublyLinkedList();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        l.display();
        l.add(4,50);
        l.display();
        System.out.println(l.size());
        l.remove(2);
        l.display();
        System.out.println(l.size());
        l.revDisplay();


//   int [][]a = {{1,2,3},
//           {4,5,6},
//           {7,8,9}};
//
//   for (int [] temp: a){
////       for (int n : temp){
////           System.out.print(n+" ");
////       }
////       System.out.println();
//       System.out.println(Arrays.toString(temp));
//   }
    }
}
