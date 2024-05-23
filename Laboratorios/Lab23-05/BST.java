public class BST{
    Node root;
    class Node{
        int value;
        Node left;
        Node right;
        Node(int value){
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }
    BST(){
        this.root = null;
    }

    // Metodos de insercion
    public void insertIterative(int value){
        if(root == null){
            root = new Node(value);
            return;
        }
        Node current = root;
        Node parent = null;
        while(current != null){
            parent = current;
            if(value < current.value){
                current = current.left;
            }else if(value > current.value){
                current = current.right;
            }else{
                System.out.println("Valor duplicado");
                return;
            }
        }
        if(value < parent.value) parent.left = new Node(value);
        else parent.right = new Node(value);
    }

    public void insertRecursive(int value){
        root = inRec(root, value);
    }
    private Node inRec(Node root, int value){
        if(root == null){
            return new Node(value);
        }
        if(value < root.value){
            root.left = inRec(root.left, value);
        }else if(value > root.value){
            root.right = inRec(root.right, value);
        }else{
            System.out.println("Valor duplicado");
        }
        return root;
    }

    // Metodos de busqueda
    public boolean searchIterative(int value){
        Node current = root;
        while(current != null){
            if(value == current.value) return true;
            else if(value < current.value) current = current.left;
            else current = current.right; 
        }
        return false;
    }

    public boolean searchRecursive(int value){
        return srcRec(root, value);
    }
    private boolean srcRec(Node root, int value){
        if(root == null) return false;
        if(value == root.value) return true;
        else if(value < root.value) return srcRec(root.left, value);
        else return srcRec(root.right, value);
    }

    // Metodos de eliminacion
    public void deleteIterative(int value){
        Node current = root;
        Node parent = null;
        while(current != null && current.value != value){
            parent = current;
            if(value < current.value) current = current.left;
            else current = current.right;
        }
        if(root == null){
            System.out.println("El valor no se encuentra en el BST");
            return;
        }
        //caso 1: Nodo a eliminar es una hoja
        if(current.left == null && current.right == null){
            if(parent == null) root = null;
            else if(parent.left == current) parent.left = null;
            else parent.right = null;
        }
        //caso 2: Nodo a eliminar tiene solo un hijo
        else if(current.left == null || current.right == null){
            Node child = (current.left != null) ? current.left : current.right;
            if(parent == null) root = child;
            else if(parent.left == current) parent.left = child;
            else parent.right = child;
        }
        //caso 3: Nodo a eliminar tiene dos hijos
        else{
            Node successor = findSuccessor(current);
            int successorValue = successor.value;
            deleteIterative(successorValue);
            current.value = successorValue;
        }
    }
    private Node findSuccessor(Node node){
        Node current = node.right;
        while(node.left != null){
            current = current.left;
        }
        return current;
    }

    public void deleteRecursive(int value){
        root = delRec(root, value);
    }
    private Node delRec(Node root, int value){
        if(root == null){
            System.out.println("El numero no se encuentra en el arbol");
            return null;
        }
        if(value < root.value) root.left = delRec(root.left, value);
        else if(value > root.value) root.right = delRec(root.right, value);
        else{
            if(root.left == null) return root.right;
            else if(root.right == null) return root.left;
            
            root.value = minVal(root.right);
            root.right = delRec(root.right, root.value);
        }
        return root;
    }
    private int minVal(Node root){
        int min = root.value;
        while(root.left != null){
            min = root.left.value;
            root = root.left;
        }
        return min;
    }

    // Metodos para imprimir
    public void preOrder(){
        preOrderRec(root);
        System.out.println();
    }
    private void preOrderRec(Node root){
        if(root == null) return;
        System.out.print(root.value + " ");
        preOrderRec(root.left);
        preOrderRec(root.right);
    }

    public void inOrder(){
        inOrderRec(root);
        System.out.println();
    }
    private void inOrderRec(Node root){
        if(root == null) return;
        inOrderRec(root.left);
        System.out.print(root.value + " ");
        inOrderRec(root.right);
    }

    public void postOrder(){
        postOrderRec(root);
        System.out.println();
    }
    private void postOrderRec(Node root){
        if(root == null) return;
        postOrderRec(root.left);
        postOrderRec(root.right);
        System.out.print(root.value + " ");
    }

    //Main
    public static void main(String[] args){
        BST tree1 = new BST();
        BST tree2 = new BST();
        int[] arr = {20, 25, 15, 10, 18, 19, 16, 13, 5, 22, 23, 24, 30};
        for(int i = 0 ; i < arr.length ; i++){
            tree1.insertIterative(arr[i]);
        }
        for(int i = 0 ; i < arr.length ; i++){
            tree2.insertRecursive(arr[i]);
        }

        tree1.inOrder();
        tree2.inOrder();

        tree1.preOrder();
        tree2.postOrder();
    }
}
