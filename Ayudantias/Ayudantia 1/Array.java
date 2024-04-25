import java.util.ArrayList;
import java.util.Scanner;

public class Array{
    public static void main(String[] args){
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Tamaño del array: ");
        int arraySize = scanner1.nextInt();
        System.out.println("A imprimir: " + arraySize);

        int[] array = new int[arraySize];
        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Elementos del array: ");
        
        //Agregar elementos al array
        for(int i=0; i < arraySize; i++){
            int elementos = scanner2.nextInt();
            System.out.println("A imprimir: " + elementos);
            array[i] = elementos;
        }

        int temp;
        int cont=0;
        for(int i = 0; i < arraySize - 1; i++) {
            System.out.println("1# For i: " + i);
            for(int j = 0; j < arraySize - i - 1; j++){
                System.out.println("2# For j: " + j);
                System.out.println("Es Mayor? " + array[j] + ">" + array[j+1]);
                if(array[j] > array[j+1]) {
                    System.out.println("SI LO ES");
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    cont++;
                }
                for(int u = 0; u < arraySize ; u++){
                    System.out.println("Ahora el arreglo es: " + "#"+ u + " "+ array[u]);
                }
            }
        } 
        System.out.println("La cantidad de modificaciones que se hizo fue de: "+ cont);
    }
}