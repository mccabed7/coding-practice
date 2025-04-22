public class AddBackward {


    public Node addBackward(Node h1, Node h2){
        Node s1 = h1;
        Node s2 = h2;

        Node head = null;
        Node runner = head;
        int carry = 0;

        while(s1 != null && s2 != null){
            
        }

        return null;
    }


    public static void main(String[] args) {
        Node head1 = new Node(1);
        head1.next = new Node(1);
        head1.next.next = new Node(1);

        Node head2 = new Node(2);
        head2.next = new Node(2);
        head2.next.next = new Node(2);

        head1.printList();


    }
}
