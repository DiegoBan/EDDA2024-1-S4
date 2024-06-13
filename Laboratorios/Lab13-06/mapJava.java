import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class mapJava {
    public static void main(String[] args) {
        System.out.println("------hashMap------");
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Diego", 20);
        hashMap.put("Vicente", 21);
        hashMap.put("Benjamin", 20);
        System.out.println("HashMap: " + hashMap);

        System.out.println("------linkedHashMap------");
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Diego", 20);
        linkedHashMap.put("Vicente", 21);
        linkedHashMap.put("Benjamin", 20); 
        System.out.println("LinkedHashMap: " + linkedHashMap);

        System.out.println("------TreeMap------");
        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Diego", 20);
        treeMap.put("Vicente", 21);
        treeMap.put("Benjamin", 20);
        System.out.println("TreeMap: " + treeMap); // Ordenado por llave
    }
}