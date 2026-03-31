package IterableOrIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Example1 {
    static void main() {
        List<Integer> li = new ArrayList<>();
        li.add(10);
        li.add(15);
        li.add(30);
        li.add(45);
        li.add(50);
        Iterator<Integer>itr = li.iterator();
        System.out.println(itr.next());
        li.add(30);
        System.out.println(itr.next());

    }
}
