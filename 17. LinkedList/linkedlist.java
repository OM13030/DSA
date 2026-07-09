

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
    public static int size;  // to define the size of the linkedlist

    public void addfirst(int data){
        //step1 = create new node
        Node newNode = new Node(data);
        size++;

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
        size++;

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


    public void addtomiddle(int idx , int data){
        if(idx == 0){
            addfirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;

        while(i < idx-1){
            temp = temp.next;
            i++;
        }
        
        //i = idx-1; temp -> prev
        newNode.next =temp.next;
        temp.next = newNode;

    }

    public int removeFirst(){
        if(size == 0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
            
            
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast(){
        if(size == 0){
            System.out.println("list is empty");
            return Integer.MIN_VALUE;
        }
        else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        // prev : i = size-2;
        Node prev = head ; 
        for(int i = 0; i < size-2; i++){
            prev = prev.next;
        }
        int val = prev.next.data;  // tail.data
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }
    public int itrsearch(int key){
        Node temp = head; 
        int i = 0;
        while(temp != null){
            if(temp.data == key){
                return i;
            }
            temp = temp.next;
            i++;

        }
        return -1;
    }


    public int helper(Node head , int key){
        if(head == null){
            return -1;
        }
        if(head.data == key){
            return 0;
        }
        int idx = helper(head.next , key);
        if(idx == -1){
            return -1;
        }
        return idx+1;
    }
    public int recSearch(int key){
        return helper(head , key);
    }


    public void reverse(){
        // next = curr.next;
        // curr.next = Prev;
        // prev = curr;
        // curr = next;
        // repeat;

        Node prev = null;
        Node curr = tail = head;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
          
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
        ll.addtomiddle(2, 9);
        ll.printll();
        System.out.println(ll.size);
        System.out.println(ll.removeFirst());
        ll.printll();
        System.out.println(ll.size);
        ll.removeLast();
        ll.printll();
        System.out.println(ll.itrsearch(3));
        System.out.println(ll.recSearch(3));
        ll.reverse();
        ll.printll();
    }
}