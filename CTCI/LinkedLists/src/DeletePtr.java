/*
    Problem:  Remove a node from a linked list, given only a pointer to that node
    Solution:  Complete
    Tested:  Yes
    Time Complexity:  O(1)
    Space Complexity: O(1)

    Notes:
        + Not a very good question.
        + The object itself isn't deleted, it just appears to be deleted.
        + If something else pointed to the node, it would still have access to the node.
        + It would also thereby have access to the full list.
 */


public class DeletePtr {

    /**
     *  A function to delete a node in the list given a ptr to it only
     @param node the node to be deleted
     */
    static void Delete(Node node){
        Node n = node;
        if(n.next == null) {
            System.out.println("Cannot remove last element");
            return;
        }

        n.data = n.next.data;
        if(n.next.next == null) {
            n.next = null;
        }
        else{
            n.next = n.next.next;
        }

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

        Node fourth = head.next.next.next;
        Delete(fourth);
        head.printList();
    }
}
