package LinkedList;

import java.util.*;

class LinkedList1 {
    Node head;

    void printLastButOneLinkedListNode() {
        Node curr = head;
        while (curr.next.next != null ) {// for last 2 node elements to skip from printing them
            System.out.println(curr.data);
            curr = curr.next;
        }
    }
}


public class IterateLastButOneNode {
    public static void main(String[] args) {
        LinkedList1 l1 = new LinkedList1();

        Node p1 = new Node(10);
        Node p2 = new Node(20);
        Node p3 = new Node(30);
        Node p4 = new Node(40);

        p1.next =p2;
        p2.next =p3;
        p3.next =p4;
        l1.head =p1;
        l1.printLastButOneLinkedListNode();
    }


}
