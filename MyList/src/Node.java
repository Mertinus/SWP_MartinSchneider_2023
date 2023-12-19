public class Node {
    private int item;
    private Node next;
    private Node last;

    public Node(int i, Node l, Node n) {
        item = i;
        last = l;
        next = n;
    }

    public int getItem() {
        return item;
    }

    public void setItem(int item) {
        this.item = item;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getLast() {
        return last;
    }

    public void setLast(Node last) {
        this.last = last;
    }
}
