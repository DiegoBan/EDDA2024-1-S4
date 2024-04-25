public class LinkedList{
    LinkedListNode head;
    public class LinkedListNode
    {
        int value;
        LinkedListNode next;
        LinkedListNode(int x)
        {
            this.value = x;
            this.next = null;
        }
        LinkedListNode(int x, LinkedListNode next)
        {
            this.value = x;
            this.next = next;
        }
    }
    
    public void insertAtStart(int x)
    {
        if(this.head == null)
        {
            this.head = new LinkedListNode(x);
            return;
        }
        LinkedListNode aux = new LinkedListNode(x, this.head);
        this.head = aux;
    }
    public void insertAtEnd(int x)
    {
        if(this.head == null){
            head = new LinkedListNode(x);
            return;
        }
        LinkedListNode aux = head;
        while(aux.next != null)
        {
            aux = aux.next;
        }
        aux.next = new LinkedListNode(x);
    }
    public void insertOrden(int x){
        if(head == null){
            head = new LinkedListNode(x);
        }
        LinkedListNode aux = head;
        while(aux.next != null && aux.next.value < x){
            aux = aux.next;
        }
        LinkedListNode n = aux.next;
        aux.next = new LinkedListNode(x);
        aux.next.next = n;
    }
    public boolean contains(int target)
    {
        LinkedListNode aux = this.head;
        while(aux != null)
        {
            if(aux.value == target)
            {
                return true;
            }
            aux = aux.next;
        }
        return false;
    }
    public void deleteAtStart()
    {
        if(this.head == null)
        {
            return;
        }
        this.head = this.head.next;
    }
    public void deleteAtEnd()
    {
        if(head == null)
        {
            return;
        }
        if(head.next == null)
        {
            head = null;
            return;
        }
        LinkedListNode aux = head;
        while(aux.next.next != null)
        {
            aux = aux.next;
        }
        aux.next = null;
    }
    public int size()
    {
        int size = 0;
        if(head == null)
        {
            return size;
        }
        LinkedListNode aux = head;
        while(aux != null)
        {
            aux = aux.next;
            size++;
        }
        return size;
    }
    public int get(int index)
    {
        if(head == null)
        {
            System.out.println("La lista está vacía");
            return -1;
        }
        if(index > size()-1)
        {
            System.out.println("Index mayor que size");
            return -1;
        }
        LinkedListNode aux = head;
        int cont = 0;
        while(cont != index)
        {
            aux = aux.next;
            cont++;
        }
        return aux.value;
    }
    public boolean isEmpty()
    {
        if(head == null)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public int indexOf(int value)
    {
        if(head == null)
        {
            System.out.println("Lista vacía");
            return -1;
        }
        LinkedListNode aux = head;
        int index = 0;
        while(aux != null)
        {
            if(aux.value == value)
            {
                return index;
            }
            index++;
            aux = aux.next;
        }
        System.out.println("No está en la lista");
        return -1;
    }
    public void invertirIterativa(){
        if(head == null || head.next == null) return;
        LinkedListNode prev = null;
        LinkedListNode actual = head;
        LinkedListNode next = null;
        while(actual != null){
            next = actual.next;
            actual.next = prev;
            prev = actual;
            actual = next;
        }
        head = prev;
    }
    public void invertirRecursiva(){
        if(head == null || head.next == null) return;
        head = invertirRecursivaUtil(head, null);
    }
    private LinkedListNode invertirRecursivaUtil(LinkedListNode actual, LinkedListNode prev){
        if(actual.next == null){
            head = actual;
            actual.next = prev;
            return null;
        }
        LinkedListNode next = actual.next;
        actual.next = prev;
        invertirRecursivaUtil(next, actual);
        return head;
    }
    public LinkedList mixSorted(LinkedList l1, LinkedList l2){
        LinkedList result = new LinkedList();
        LinkedListNode x = new LinkedListNode(0);
        LinkedListNode actual = x;
        LinkedListNode aux1 = l1.head;
        LinkedListNode aux2 = l2.head;

        while(aux1 != null && aux2 != null){
            if(aux1.value < aux2.value){
                actual.next = aux1;
                aux1 = aux1.next;
            }else{
                actual.next = aux2;
                aux2 = aux2.next;
            }
            actual = actual.next;
        }
        if(aux1 != null){
            actual.next = aux1;
        }
        if(aux2 != null){
            actual.next = aux2;
        }

        result.head = x.next;
        return result;
    }
    public void print()
    {
        LinkedListNode aux = this.head;
        while(aux != null)
        {
            System.out.print(aux.value + " -> ");
            aux = aux.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args){
        
    }
}
