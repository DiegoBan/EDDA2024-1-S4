import java.util.Arrays;

public class arrayCircular {
    public static void rotarIzquierda(int[] arreglo, int r) {
        int n = arreglo.length;
        
        // Normalizamos la cantidad de rotaciones si es mayor que el tamaño del arreglo
        r = r % n;
        
        // Creamos un arreglo auxiliar para almacenar los elementos rotados
        int[] auxiliar = new int[n];
        
        // Copiamos los elementos a rotar al arreglo auxiliar
        for (int i = 0; i < n; i++) {
            auxiliar[i] = arreglo[i];
        }
        
        // Rotamos los elementos
        for (int i = 0; i < n; i++) {
            int indiceRotado = (i + r) % n;
            arreglo[i] = auxiliar[indiceRotado];
        }
    }
    
    public static void main(String[] args) {
        int[] arreglo = {5, 7, 8, 9};
        int r = 1;
        
        System.out.println("Arreglo original: " + Arrays.toString(arreglo));
        rotarIzquierda(arreglo, r);
        System.out.println("Arreglo rotado a la izquierda " + r + " posiciones: " + Arrays.toString(arreglo));
    }
}
