package HashmapImpl;


public class Hashset {

    Node[] a = new Node[10];
    int count = 0;

    public int size() {
        return count;
    }

    public boolean add(Object ele) {

        if (ele == null)
            ele = "null";

        int index = Math.abs(ele.hashCode() % a.length);

        // Case 1: bucket empty
        if (a[index] == null) {
            a[index] = new Node(ele);
            count++;
            return true;
        }

        // Case 2: collision → traverse linked list
        Node curr = a[index];

        while (true) {
            // duplicate found
            if (curr.ele.equals(ele))
                return false;

            // reached last node
            if (curr.next == null)
                break;

            curr = curr.next;
        }

        // add at end
        curr.next = new Node(ele);
        count++;
        return true;
    }

    public void display() {
        for (int i = 0; i < a.length; i++) {
            Node curr = a[i];
            while (curr != null) {
                System.out.println(curr.ele);
                curr = curr.next;
            }
        }
    }
}
