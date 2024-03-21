import java.util.Scanner;

public class matriztranspuesta {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        System.out.print("Filas: ");
        int filas = scan.nextInt();

        System.out.print("Columnas: ");
        int columnas = scan.nextInt();

        int[][] matriz = new int[filas][columnas];

        System.out.println("Llene la matriz");
        for(int j = 0 ; j < columnas ; j++){
            for(int i = 0 ; i < filas ; i++){
                System.out.printf("elemento [%d,%d]:",i,j);
                matriz[i][j] = scan.nextInt();
            }
        }
        
        int[][] transpuesta = new int[columnas][filas];
        for(int j = 0 ; j < columnas ; j++){
            for(int i = 0 ; i < filas ; i++){
                transpuesta[j][i] = matriz[i][j];
            }
        }

        System.out.println("La matriz transpuesta es:");
        for(int j = 0 ; j < transpuesta[0].length ; j++){
            for(int i = 0 ; i < transpuesta.length ; i++){
                System.out.print(transpuesta[i][j] + " ");
            }
            System.out.println();
        }

        scan.close();
    }
}