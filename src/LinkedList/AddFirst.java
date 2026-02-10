package LinkedList;
import java.util.*;

class Linkedlist3{
    Node head;

    void printLinkedlist(){
        Node curr = head;
        while(curr != null){
            System.out.println(curr.data);
            curr = curr.next;
        }
    }

    void addNode(int e){
        Node temp = new Node(e);
        if(head == null){
            head = temp;
        }else{
            Node curr = head;
            while(curr.next != null){
                curr= curr.next;
            }
            curr.next = temp;
            temp.next = null;

        }
    }

    void addFirst(int e){
        Node temp = new Node(e);
        if(head == null){
            head = temp;
        }else{
            Node curr = head;
            while(curr.next != null){
                curr = curr.next;
            }
            temp.next = head;
            head = temp;
        }
    }
}

public class AddFirst {
    public static void main(String[] args) {
        Linkedlist3 l1 = new Linkedlist3();
        l1.addNode(10);
        l1.addNode(50);
        l1.addNode(20);
        l1.addFirst(30);
        l1.printLinkedlist();
    }
}
