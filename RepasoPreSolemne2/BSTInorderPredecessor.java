import java.util.ArrayList;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class BSTInorderPredecessor {
    public static void main(String[] args) {
        // Crear un árbol de ejemplo
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(9);

        // Recorrer el árbol en orden y almacenar los valores en un arreglo
        ArrayList<Integer> inorderList = new ArrayList<>();
        inorderTraversal(root, inorderList);

        // Buscar el antecesor de un número en el arreglo
        int target = 7;
        int predecessor = findPredecessor(inorderList, target);

        System.out.println("Antecesor de " + target + " es: " + predecessor);
    }

    public static void inorderTraversal(TreeNode root, ArrayList<Integer> list) {
        if (root != null) {
            inorderTraversal(root.left, list);
            list.add(root.val);
            inorderTraversal(root.right, list);
        }
    }

    public static int findPredecessor(ArrayList<Integer> list, int target) {
        int predecessor = Integer.MIN_VALUE;
        for (int num : list) {
            if (num >= target) {
                break;
            }
            predecessor = num;
        }
        return predecessor;
    }
}
