package LinkedList;
import java.util.*;


public class PrintLinkedList {

    static void printLinkedList(Node head){
        Node current = head;
        while(current !=null){
            System.out.println(current.data);
            current = current.next;
        }

    }
    public static void main(String[] args) {
        Node p1= new Node(20);
        Node p2= new Node(30);
        Node p3= new Node(40);
        Node p4= new Node(50);

        Node head =p1;
        p1.next =p2;
        p2.next =p3;
        p3.next =p4;
       printLinkedList(head);


    }
}
