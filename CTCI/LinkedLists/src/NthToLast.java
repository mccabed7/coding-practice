/*
    Problem:  Return the nth to last element of a singly linked list
    Solution:  Incomplete
    Tested:  No
    Time Complexity:
    Space Complexity:

    Notes:
        +
        +
        +
 */

public class NthToLast {


    /**
     *
     @param node head of the list
     */
    public static Node nthToLast(Node node, int i){
        return null;
    }



    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(1);
        head.next.next = new Node(3);
        head.next.next.next = new Node(5);
        head.next.next.next.next = new Node(44);
        head.next.next.next.next.next = new Node(1333);
        head.next.next.next.next.next.next = new Node(7);
        head.next.next.next.next.next.next.next = new Node(991);
        head.next.next.next.next.next.next.next.next = new Node(1343);
        head.next.next.next.next.next.next.next.next.next = new Node(1111);
        head.next.next.next.next.next.next.next.next.next.next = new Node(1661);
        head.printList();
    }
}
