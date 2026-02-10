package LinkedList;


//Case1 : Linked list is empty
// if head is pointing to null then the linked list is empty


//Case2 : Linked list is not empty


//Steps:
//Step1: Create a new Node
//Step2: Check whether the linked list is empty or not
//
//if(head == null):
//    make temp as head
//        else:
//            add temp to last node

class LinkedList2{
    Node head;
    void printLinkedList(){
        Node curr = this.head;
        while(curr!= null){
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
}

public class AddElementToLL {
    public static void main(String[] args) {
        LinkedList2 l1 = new  LinkedList2();
        l1.addNode(20);
        l1.addNode(30);
        l1.printLinkedList();

    }

}
