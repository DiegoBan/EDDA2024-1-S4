import java.util.Scanner;

public class intInverso {

    public static String invertirCadena(String cadena) {
        int longitud = cadena.length();
        char[] caracteres = cadena.toCharArray(); // Convierte la cadena en un array de caracteres
        
        for (int i = 0; i < longitud / 2; i++) {
            char temp = caracteres[i];
            caracteres[i] = caracteres[longitud - 1 - i];
            caracteres[longitud - 1 - i] = temp;
        }
        
        return new String(caracteres); // Convierte el array de caracteres invertido de nuevo a una cadena
    }
    
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Ingresa el numero a invertir: ");
        String cadena = scanner1.nextLine();
        String cadenaInvertida = invertirCadena(cadena);
        System.out.println("La cadena '" + cadena + "' invertida es: " + cadenaInvertida);
    }
}
