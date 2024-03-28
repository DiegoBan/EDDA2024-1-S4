import java.util.Scanner;

public class mezclarOrden{
    public int[] mezcla(int[] arr1, int[] arr2){
        
    }
    public void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[m];
        for(int i = 0 ; i < n ; i++){
            arr1[i] = scan.nextInt();
        }
        for(int i = 0 ; i < m ; i++){
            arr2[i] = scan.nextInt();
        }
        int[] mezcla = mezcla(arr1, arr2);
        System.out.printf("{");
        for(int i = 0 ; i < mezcla.length ; i++){
            System.out.printf("%s,", mezcla[i]);
        }
        System.out.printf("}");
        scan.close();
    }
}