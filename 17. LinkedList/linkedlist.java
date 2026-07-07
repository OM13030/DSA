public class linkedlist{

    public static class Node {
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next  = null;

        }
    }

    public static Node head; 
    public static Node tail;

    public void addfirst(int data){
        //step1 = create new node
        Node newNode = new Node(data);

        if(head == null){
            head = tail = newNode;
            return;
        }

        //step2 - newNode next = head
        newNode.next = head;

        //step3 - head = newNode;
        head = newNode;

    }

    public void addlast(int data){
        // step1 = create a new node
        Node newNode = new Node(data);

        if(head == null){
            head = tail = newNode;
            return;
        }

        //step2 - tail next = newNode
        tail.next = newNode;

        //step3 - tail = newNode;
        tail = newNode;
    }

    public void printll() {
    if (head == null) {
        System.out.println("LL is empty");
        return;
    }

    Node temp = head;

    while (temp != null) {
        System.out.print(temp.data + " -> ");
        temp = temp.next;
    }

    System.out.println("null");
    }


    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.addfirst(2);
        ll.printll();
        ll.addfirst(1);
        ll.printll();
        ll.addlast(3);
        ll.printll();
        ll.addlast(4);
        ll.printll();
        
    }
}