import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class interseccion {
    public static int[] intersection(int[] nums1, int[] nums2){
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> intersection = new HashSet<>();
        for(int num : nums1){
            set1.add(num);
        }
        for(int num : nums2){
            if(set1.contains(num)) intersection.add(num);
        }
        int[] sol = new int[intersection.size()];
        int i = 0;
        for(int num : intersection){
            sol[i] = num;
            i++;
        }
        return sol;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.printf("Ingrese largo de arreglo 1: ");
        int n1 = scan.nextInt();
        int[] nums1 = new int[n1];
        System.out.println("Ingrese numeros de arreglo 1:");
        for(int i = 0 ; i < n1 ; i++){
            nums1[i] = scan.nextInt();
        }
        System.out.printf("Ingrese largo de arreglo 2: ");
        int n2 = scan.nextInt();
        int[] nums2 = new int[n2];
        for(int i = 0 ; i < n2 ; i++){
            nums2[i] = scan.nextInt();
        }
        int[] sol = intersection(nums1, nums2);
        System.out.printf("[");
        for(int i = 0 ; i < sol.length-1 ; i++){
            System.out.printf("%d ", sol[i]);
        }
        System.out.printf("%d]\n", sol[sol.length-1]);
    }
}