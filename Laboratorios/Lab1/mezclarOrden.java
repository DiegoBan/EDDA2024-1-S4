import java.util.Scanner;

public class mezclarOrden{
    public static int[] mezcla(int[] arr1, int[] arr2){
        int[] mezcla = new int[arr1.length + arr2.length];
        int i1 = 0, i2 = 0;
        for(int i = 0 ; i < mezcla.length ; i++){
            if(i1 < arr1.length && arr1[i1] <= arr2[i2]){
                mezcla[i] = arr1[i1];
                i1++;
            }else{
                mezcla[i] = arr2[i2];
                i2++;
            }
        }
        return mezcla;
    }
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.printf("n = ");
        int n = scan.nextInt();
        System.out.printf("m = ");
        int m = scan.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[m];
        for(int i = 0 ; i < n ; i++){
            System.out.printf("arr1[%s] = ", i);
            arr1[i] = scan.nextInt();
        }
        for(int i = 0 ; i < m ; i++){
            System.out.printf("arr2[%s] = ", i);
            arr2[i] = scan.nextInt();
        }
        int[] mezcla = mezcla(arr1, arr2);
        System.out.printf("{");
        for(int i = 0 ; i < mezcla.length ; i++){
            System.out.printf(" %s ", mezcla[i]);
        }
        System.out.println("}");
        scan.close();
    }
}
