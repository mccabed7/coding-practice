/*
    Problem:  Return the nth to last element of a singly linked list
    Solution:  Complete
    Tested:  Yes
    Time Complexity:  O(n)
    Space Complexity: O(1)

    Notes:
        + An example where iteration is far superior to recursion
        + Another two-pointer approach, both going in the same direction
        + This was a very simple problem
 */

public class NthToLast {


    /**
     *  A function to return the nth last node in a linked list
     @param node head of the list
     @return The n-th last node, or null if index out of bounds
     */
    public static Node nthToLast(Node node, int n){
        if(n == 0) return null;
        Node start = node;  //new 'safe' pointer to start node
        Node leadNode = node;
        for (int i = 0; i < n - 1; i++){ //n = ((how far ahead we go) - (1))
            if(leadNode.next == null) return null;
            leadNode = leadNode.next;
        }
        while (leadNode.next != null){
            leadNode = leadNode.next;
            start = start.next;
        }
        return start;
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
        System.out.println(nthToLast(head, 3).data);
    }
}
