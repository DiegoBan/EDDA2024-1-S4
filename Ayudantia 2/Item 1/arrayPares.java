import java.util.Arrays;

public class arrayPares {
    public static int[][] obtenerPares(int n, int[] arreglo) {
        int[][] pares = new int[n * n][2]; // Calcula el tamaño de la matriz de pares
        
        int contador = 0; // Contador para llevar el índice de la matriz de pares
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                pares[contador][0] = arreglo[i]; // Primer elemento del par
                pares[contador][1] = arreglo[j]; // Segundo elemento del par
                contador++; // Incrementa el contador
            }
        }
        
        return pares;
    }
    
    public static void main(String[] args) {
        int N = 3;
        int[] A = {1, 2, 3};
        int[][] pares = obtenerPares(N, A);
        
        // Imprime la matriz de pares
        for (int i = 0; i < pares.length; i++) {
            System.out.println(Arrays.toString(pares[i]));
        }
    }
}
