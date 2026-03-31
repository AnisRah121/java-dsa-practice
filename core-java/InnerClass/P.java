package InnerClass;

import java.util.Iterator;

public class P {
    Iterator iterator() {
        return new Iterator() {

            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public Object next() {
                return null;
            }

            @Override
            public void remove() {
            }
        };
    }

}
