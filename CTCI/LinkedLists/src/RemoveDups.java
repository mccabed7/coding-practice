/*
    Problem:
    Solution: incomplete
    Tested:
    Time Complexity:
    Space Complexity:

    Notes:
        +
        +
 */



public class RemoveDups {


    /**
     * An algorithm to
     @param \. 
     @return ...
     */


    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(11);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(11);
        head.next.next.next.next.next.next = new Node(7);
        head.next.next.next.next.next.next.next = new Node(11);
        head.next.next.next.next.next.next.next.next = new Node(11);
        head.next.next.next.next.next.next.next.next.next = new Node(11);

        head.printList();
        removeDups(head);
        head.printList();
    }

    //todo, implement O(n) time O(n) space version


    //todo fully test
    public static void removeDups(Node node) {
        if (node == null) return;
        removeNum(node, node.data);
        removeDups(node.next);
        return;
    }

    //todo fully test
    public static void removeNum(Node start, int num){
        if(start == null || start.next == null) return;
        else if(start.next.data == num){
            while(start.next != null && start.next.data == num){
                start.next = start.next.next;
            }

        }
        removeNum(start.next, num);
    }
}
