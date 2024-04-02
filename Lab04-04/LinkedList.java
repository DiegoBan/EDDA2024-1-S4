import java.util.Scanner;

public class LinkedList{
    LinkedListNode head;
    public class LinkedListNode{
        int value;
        LinkedListNode next;
        LinkedListNode(int value){
            this.value = value;
        }
    }
    public void insert(int x){
        //a llenar
    }
    public void print(){
        LinkedListNode aux = this.head;
        while(aux != null){
            System.out.printf("%s -> ", aux.value);
            aux = aux.next;
        }
        System.out.printf("null");
    }
    public static void main(String args[]){
        LinkedList list = new LinkedList();
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.println("1: ingresar numero | cualquier otro numero: terminar programa");
            if(scan.nextInt() == 1){
                System.out.printf("Ingrese numero: ");
                list.insert(scan.nextInt());
                System.out.printf("Lista: ");
                list.print();
            }else{
                break;
            }
        }
        scan.close();
    }
}
