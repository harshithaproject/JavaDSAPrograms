package LinkedList;


class Linkedlist5{
    Node head;
    void printLinkedlist(){
        Node curr = head;
        while(curr!= null){
            System.out.println(curr.data);
            curr = curr.next;
        }
    }

    void removeNode(int data){
        Node temp = new Node(data);
    }
}
public class RemoveNode {
    public static void main(String[] args) {

    }
}
