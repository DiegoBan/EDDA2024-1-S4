import java.util.Scanner;
import java.util.PriorityQueue;
import java.util.Comparator;
import java.util.Iterator;

public class torres {
    public static int min(int[] cubos){
        PriorityQueue<Integer> torres = new PriorityQueue<>();

        for(int cubo : cubos){
            Iterator<Integer> iterator = torres.iterator();
            while(iterator.hasNext()){
                int actual = iterator.next();
                if(actual > cubo){
                    iterator.remove();
                    break;
                }
            }
            torres.add(cubo);
        }

        return torres.size();
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.printf("Numero de cubos: ");
        int n = scan.nextInt();
        int[] cubos = new int[n];
        System.out.printf("Tamaños de los cubos: ");
        for(int i = 0 ; i < n ; i++){
            cubos[i] = scan.nextInt();
        }
        System.out.println("Minimo de torres: "+min(cubos));
    }
}