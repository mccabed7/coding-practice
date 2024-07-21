public class Node {

    Node next = null;
    int data;

    public Node(int data) {
        this.data = data;
    }

    public void appendToTail(int data) {
        Node newNode = new Node(data);
        Node n = this;
        while (n.next != null) {
            n = n.next;
        }
        n.next = newNode;
    }
}
