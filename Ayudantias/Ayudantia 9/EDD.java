import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

public class EDD {
    public static void main(String[] args) {
        Set<String> NombreHashset = new HashSet<String>();
        NombreHashset.add("a");
        NombreHashset.add("b");
        NombreHashset.add("c");
        NombreHashset.add("d");

        HashMap<String, String> NombreMap = new HashMap<>();
        NombreMap.put("DieguitoBanda", "Metallica");
        NombreMap.put("BenjaTilin", "Aphex Twin");
        NombreMap.put("LilianaEmo", "New Jeans");
        NombreMap.put("Vichowo", "Pierce The Veil");

        Queue<Integer> NombreQueue = new PriorityQueue<>();
        NombreQueue.offer(3);
        NombreQueue.offer(2);
        NombreQueue.offer(4);
        NombreQueue.offer(1);
        NombreQueue.offer(5);
        NombreQueue.offer(7);

        printHashSet(NombreHashset);
        printHashMap(NombreMap);
        printQueue(NombreQueue);
    }

    public static void printHashSet(Set<String> set) {
        System.out.println("Contenido del HashSet:");
        for (String element : set) {
            System.out.println(element);
        }
        System.out.println("--------------------------------------");
    }

    public static void printHashMap(HashMap<String, String> map) {
        System.out.println("Contenido del HashMap:");
        for (String key : map.keySet()) {
            System.out.println(key + " : " + map.get(key));
        }
        System.out.println("--------------------------------------");
    }

    public static void printQueue(Queue<Integer> queue) {
        System.out.println("Contenido del PriorityQueue:");
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
        System.out.println("--------------------------------------");
    }
}
