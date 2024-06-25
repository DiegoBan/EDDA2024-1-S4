import java.util.Scanner;
import java.util.PriorityQueue;

public class first {
    public static int first(int[] nums){
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        int sol = 1;
        for(int num : nums){
            priorityQueue.add(num);
        }
        while(!priorityQueue.isEmpty()){
            int actual = priorityQueue.poll();
            if(sol > actual) continue;
            else if(sol == actual) sol++;
            else return sol;
        }
        return sol;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.printf("Ingresar largo del arreglo: ");
        int n = scan.nextInt();
        int[] nums = new int[n];
        for(int i = 0 ; i < n ; i++){
            nums[i] = scan.nextInt();
        }
        System.out.printf("%d\n", first(nums));
    }
}