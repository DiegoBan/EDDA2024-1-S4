import java.util.HashSet;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class setJava {
    public static void main(String[] args) {
        System.out.println("------hashSet------");
        Set<Integer> hashSet = new HashSet<>();
        hashSet.add(5);
        hashSet.add(1);
        hashSet.add(5);
        System.out.println("HashSet: " + hashSet);

        System.out.println("------linkedHashSet------");
        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(5);
        linkedHashSet.add(1);
        linkedHashSet.add(5);
        System.out.println("LinkedHashSet: " + linkedHashSet);

        System.out.println("------TreeSet------");
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(5);
        treeSet.add(1);
        treeSet.add(5);
        System.out.println("TreeSet: " + treeSet); // Ordenado
    }
}
