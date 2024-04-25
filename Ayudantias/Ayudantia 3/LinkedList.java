import com.sun.jdi.Value;

class LinkedList{
    Node head;
    public class Node{
        int value;
        Node next;

        //constructor del nodo
        public Node(int value){
            this.value= value;
        }
        public Node(int value, Node next){
            this.value = value;
            this.next= next;
        }
    }

    void insertHead(int x){
        if(this.head == null){
            this.head = new Node(x, null);
            return;
        }
        Node aux = new Node(x, this.head);
        this.head = aux;
    }

    void insertLast(int x){
        Node aux = this.head;
        while(aux.next != null){
            aux = aux.next;
        }
        //System.out.println(aux.value);
        aux.next = new Node(x);
    }

    void printList(){
        Node aux= this.head;
        while(aux != null){
            System.out.println(aux.value);
            aux = aux.next;
        }
    }

    public static void main(String[] args){
        LinkedList L= new LinkedList();
        L.insertHead(5);
        L.insertHead(9);
        L.insertHead(4);
        L.insertHead(6);
        //L.printList();
        L.insertLast(13);
        //L.printList();
    }
}

//InsertLast T(n)= O(1)
//PrintList T(n)= O(N) por el while
