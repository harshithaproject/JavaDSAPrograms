package LinkedList;
import java.util.*;

class LinkedList1{
    Node head;
    void printLastButOneLinkedListNode(){
        Node curr = head;
        while(curr!= null &&curr.next == null){
            System.out.println(curr.data);
            curr = curr.next;
        }
    }
}


public class IterateLastButOneNode {
    LinkedList1 l1 = new LinkedList1();

    Node p1 = new Node(10);
    Node p2 = new Node(20);
    Node p3 = new Node(30);
    Node p4 = new Node(40);



}
