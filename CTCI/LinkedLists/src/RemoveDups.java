/*
    Problem:  Remove duplicates from a singly-linked list
    Solution:  Complete
    Tested:  Yes
    Time Complexity: O(n^2)    | O(n) for dups2
    Space Complexity:  O(n^2)  | O(n) for dups2

    Notes:
        +  Dups2 is ultimately superior; written non-recursively.
        +  HashSet used above other data structures, for best space growth and use.
        +  O(1) lookup in hashet makes it much more useful than ArrayList in this case.
 */

//import java.util.ArrayList;
import java.util.HashSet;


public class RemoveDups {



    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(1);
        head.next.next = new Node(3);
        head.next.next.next = new Node(3);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(11);
        head.next.next.next.next.next.next = new Node(7);
        head.next.next.next.next.next.next.next = new Node(11);
        head.next.next.next.next.next.next.next.next = new Node(1);
        head.next.next.next.next.next.next.next.next.next = new Node(11);
        head.next.next.next.next.next.next.next.next.next.next = new Node(11);

        head.printList();
        //removeDups(head);
        removeDups2(head);
        head.printList();
    }


    /**
     * An algorithm to remove all duplicates from a singly linked list
     @param node The node to start processing from
     */
    public static void removeDups(Node node) {
        if (node == null) return;
        removeNum(node, node.data);
        removeDups(node.next);
        return;
    }


    public static void removeNum(Node start, int num){
        if(start == null || start.next == null) return;
        else if(start.next.data == num){
            while(start.next != null && start.next.data == num){
                start.next = start.next.next;
            }
        }
        removeNum(start.next, num);
    }

    /**
     * An algorithm to remove all duplicates from a singly linked list
     @param node The node to start processing from
     */
    public static void removeDups2(Node node) {
        Node start = node;
        HashSet<Integer> set = new HashSet<Integer>();
        set.add(start.data);
        while(start.next != null){
            if(!set.contains(start.next.data)){
                set.add(start.next.data);
                start = start.next;
            }
            else{
                start.next = start.next.next;
            }
        }

    }
}
