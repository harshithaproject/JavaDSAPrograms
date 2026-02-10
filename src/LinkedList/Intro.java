package LinkedList;
import java.util.*;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}

public class Intro {
    public static void main(String[] args) {
        Node p1 = new Node(10);
        Node p2 = new Node(20);
        Node p3 = new Node(30);

        p1.next = p2;
        p2.next = p3;
        Node head = p1;

        System.out.println(p1.next);
        System.out.println(p2.next);
        System.out.println(p3.next);
    }
}
