/*
    Problem:  Partition a singly-linked list around an integer x
    Solution:  Complete
    Tested:  Yes
    Time Complexity:  O(n)
    Space Complexity: O(1)

    Notes:
        + Iteration is fine here; faster than recursion
        + Optimal speed and space performance
        +
        +
 */

public class Partition {

    /**
     *  A function to partition a singly-linked list around an integer
     @param node head of the list
     @param x the integer to partition around
     */
    public static Node partition(Node node, int x){
        Node n = node;
        Node head = null;
        Node leftPtr = null;
        Node rightHead = null;
        Node rightPtr = null;

        while (n != null){
            if(n.data < x){
                if(head == null){
                    head = n;
                    leftPtr = n;
                }
                else{
                    leftPtr.next = n;
                    leftPtr = leftPtr.next;
                }
                n = n.next;
            }
            else if (n.data > x){

                if(rightHead == null){
                    rightHead = n;
                    rightPtr = n;
                }
                else{
                    rightPtr.next = n;
                    rightPtr = rightPtr.next;
                }
                n = n.next;
            }
            else{
                Node xNode = n;
                n = n.next;
                xNode.next = rightHead;
                rightHead = xNode;
            }

        }
        if(leftPtr != null){
            leftPtr.next = rightHead;
            return head;
        }
        else{
            return rightHead;
        }

    }


    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(1);
        head.next.next = new Node(3);
        head.next.next.next = new Node(100);
        head.next.next.next.next = new Node(44);
        head.next.next.next.next.next = new Node(1333);
        head.next.next.next.next.next.next = new Node(7);
        head.next.next.next.next.next.next.next = new Node(991);
        head.next.next.next.next.next.next.next.next = new Node(5);
        head.next.next.next.next.next.next.next.next.next = new Node(1111);
        head.next.next.next.next.next.next.next.next.next.next = new Node(1661);
        head.printList();

        partition(head, 7).printList();
    }
}
