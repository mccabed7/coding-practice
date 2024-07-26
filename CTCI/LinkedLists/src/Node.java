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

    public void printList(){
        Node n = this;
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
        System.out.println();
    }
}
