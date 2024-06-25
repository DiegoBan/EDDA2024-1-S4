import java.util.ArrayList;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class BSTrecursivo {
    public static void main(String[] args) {
        // Crear un árbol de ejemplo
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(9);

        // Buscar el antecesor de un número en el árbol
        int target = 7;
        TreeNode predecessorNode = antecesorBST(root, target);

        if (predecessorNode != null) {
            System.out.println("Antecesor de " + target + " es: " + predecessorNode.val);
        } else {
            System.out.println("No se encontró antecesor para " + target);
        }
    }

    public static TreeNode antecesorBST(TreeNode root, int target) {
        TreeNode antecesor = null;
        while (root != null) {
            if (root.val == target) {
                if (root.left != null) {
                    antecesor = root.left;
                    while (antecesor.right != null) {
                        antecesor = antecesor.right;
                    }
                }
                break;
            } else if (root.val < target) {
                antecesor = root;
                root = root.right;
            } else {
                root = root.left;
            }
        }
        return antecesor;
    }
}
