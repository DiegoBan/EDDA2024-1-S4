import java.util.Arrays;

public class matrixMultiplicacion {
    public static int[][] multiplicarMatrices(int[][] matriz1, int[][] matriz2) {
        int filas = matriz1.length;
        int columnas = matriz1[0].length;
        int[][] resultado = new int[filas][columnas];
        
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resultado[i][j] = matriz1[i][j] * matriz2[i][j];
            }
        }
        
        return resultado;
    }
    
    public static void main(String[] args) {
        int[][] M1 = {{2, 2}, {3, 3}};
        int[][] M2 = {{5, 5}, {10, 10}};
        
        int[][] resultado = multiplicarMatrices(M1, M2);
        
        // Imprime el resultado
        for (int i = 0; i < resultado.length; i++) {
            System.out.println(Arrays.toString(resultado[i]));
        }
    }
}
