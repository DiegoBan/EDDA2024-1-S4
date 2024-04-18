import java.util.Scanner;

public class numeroabinario {
    public static int binario(int x){
        if(x < 2) return x;
        else return x%2 + 10*binario(x/2);
    }
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese numero: ");
        int x = scan.nextInt();
        System.out.println("Binaro: " + binario(x));
        scan.close();
    }
}
