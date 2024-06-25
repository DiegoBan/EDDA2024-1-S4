class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class BalancedBST {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(15);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(7);
        root.right.right = new TreeNode(20);
        

        boolean isBalanced = isBalancedBST(root);
        System.out.println("El árbol está balanceado: " + isBalanced);
    }

    public static boolean isBalancedBST(TreeNode root) {
        if (root == null) {
            return true; // Un árbol vacío se considera balanceado
        }

        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);

        if (Math.abs(leftHeight - rightHeight) > 1) {
            return false; // La diferencia de alturas es mayor que 1, el árbol no está balanceado
        }

        // Verificar si los subárboles izquierdo y derecho también están balanceados
        return isBalancedBST(root.left) && isBalancedBST(root.right);
    }

    public static int getHeight(TreeNode node) {
        if (node == null) {
            return 0; // Altura de un árbol vacío es 0
        }

        int leftHeight = getHeight(node.left);
        int rightHeight = getHeight(node.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }
}
