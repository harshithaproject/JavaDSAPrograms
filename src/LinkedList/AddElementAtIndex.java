package LinkedList;

//In linked list there is no indexing concept. We have to count until the current.next == null
//We want to add element to linked list based on index - add(3,25) index=3 and element =25

class LinkedList4 {
    Node head;

    void printLinkedList(){
        Node curr = head;
        while(curr != null){
            System.out.println(curr.data);
            curr= curr.next;
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
    void addatIndex(int index, int data) {
        try {
        Node temp = new Node(data);
        if(index ==0){
            addFirst(data);
        }else {
            int count =0;
            Node curr = head;

                while (count < index - 1) {
                    curr = curr.next;
                    count++;
                }

            temp.next = curr.next;
            curr.next = temp;
        } }catch (NullPointerException e) {
            throw new IndexOutOfBoundsException();
        }
    }
}

public class AddElementAtIndex {
    public static void main(String[] args) {
        LinkedList4 l1 = new LinkedList4();
        l1.addNode(10);
        l1.addFirst(20);
        l1.addNode(40);
        l1.addNode(50);
       l1.addatIndex(10,30);
        l1.printLinkedList();

    }
}
