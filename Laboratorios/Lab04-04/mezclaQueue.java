import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;

public class mezclaQueue{
    public static Queue<Integer> mezcla(Queue<Integer> q1, Queue<Integer> q2){
        Queue<Integer> mix = new LinkedList<>();
        while(!q1.isEmpty() && !q2.isEmpty()){
            if(q1.peek() <= q2.peek()){
                mix.offer(q1.poll());
            }else{
                mix.offer(q2.poll());
            }
        }
        while(!q1.isEmpty()){
            mix.offer(q1.poll());
        }
        while(!q2.isEmpty()){
            mix.offer(q2.poll());
        }
        return mix;
    }
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        System.out.printf("Ingrese largo 1: ");
        int n = scan.nextInt();
        System.out.printf("Ingrese largo 2: ");
        int m = scan.nextInt();
        System.out.println("Cola 1:");
        for(int i = 0 ; i < n ; i++){
            System.out.printf("(%s) = ", i+1);
            q1.offer(scan.nextInt());
        }
        System.out.println("Cola 2:");
        for(int i = 0 ; i < m ; i++){
            System.out.printf("(%s) = ", i+1);
            q2.offer(scan.nextInt());
        }
        Queue<Integer> mix = mezcla(q1, q2);
        System.out.printf("Mezcla: ");
        while(!mix.isEmpty()){
            System.out.printf("%s ", mix.poll());
        }
        scan.close();
    }
}
