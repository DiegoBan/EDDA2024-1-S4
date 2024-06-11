class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    
    TreeNode(int x) {
        val = x;
    }
}

public class BinaryTree {
    
    public int height(TreeNode root) {
        if (root == null) {
            return -1; // Si consideras que la altura de un árbol vacío es 0, devuelve 0 aquí.
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        
        // Creación de un árbol de ejemplo
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.left.right.right = new TreeNode(5);
        
        System.out.println("La altura del árbol es: " + tree.height(root));
    }
}
