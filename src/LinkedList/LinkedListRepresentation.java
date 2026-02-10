package LinkedList;

//PROPERTIES OF LINKEDLIST
//1. Every Linked list will have a reference called as head and head will always point to the first element or to null if the linked list is empty.

//2. Linked list is a collection of nodes and every nodes has two parts data and next(address pointing to the next node)

//3. tHE NEXT part of the last node is always Null

class LinkedList{
    Node head;

    void printLinkedList(){
        Node curr = head;
        while(curr!= null){
            System.out.println(curr.data);
            curr = curr.next;
        }

    }
}

public class LinkedListRepresentation {
    public static void main(String[] args) {
       LinkedList l1 = new  LinkedList();
        Node p1= new Node(200);
        Node p2= new Node(300);
        Node p3= new Node(400);
        Node p4= new Node(500);


        p1.next =p2;
        p2.next =p3;
        p3.next =p4;
        l1.head =p1;
        l1.printLinkedList();

    }
}





