import java.util.List;

public class MyList <T> {
    private Node first = null;
    private Node last = null;

    public MyList() {
    }

    public void Add(int item) {
        if (first == null) {
            first = new Node(item, null, null);
            last = first;
        }
        else {
            last = new Node(item, last, null);
            last.getLast().setNext(last);
        }
    }

    public int Get(int index) {
        Node current = first;
        int counter = 0;
        do {
            if (counter == index)
                return current.getItem();

            counter++;
            current = current.getNext();
        } while (current != null);

        return -1;
    }

    public void Remove(int index) {
        Node current = first;
        int counter = 0;
        do {
            if (counter == index) {
                if (current == first) {
                    Node nextNode = current.getNext();
                    nextNode.setLast(null);
                    first = nextNode;
                }
                else if (current == last) {
                    Node previousNode = current.getLast();
                    previousNode.setNext(null);
                    last = previousNode;
                }
                else {
                    Node previousNode = current.getLast();
                    Node nextNode = current.getNext();
                    previousNode.setNext(nextNode);
                    nextNode.setLast(previousNode);
                }

                return;
            }

            counter++;
            current = current.getNext();
        } while (current != null);
    }

    public void Print() {
        Node current = first;
        int counter = 0;
        do {
            System.out.println(counter + "\t" + current.getItem());
            counter++;
            current = current.getNext();
        } while (current != null);
    }
}
