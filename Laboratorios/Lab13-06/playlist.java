import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class playlist {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Set<Integer> hashSet = new HashSet<>();

        System.out.printf("Cantidad de canciones: ");
        int n = scan.nextInt();
        System.out.printf("Canciones: ");
        for(int i = 0 ; i < n ; i++){
            hashSet.add(scan.nextInt());
        }

        System.out.println(hashSet.size());
    }
}