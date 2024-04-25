// hacer un movimiento de arreglos para mover los elementos para que sea creaciente
// in

import java.util.ArrayList;
import java.util.Scanner;

public class SpiralMatrix {
    public static int[] spiral(int matrix[][]){
        int n = matrix.length;
        int m = matrix[0].length;
        int[] output = new int[n * m];
        int xstart = 0;
        int xfinal = n - 1;
        int ystart = 0;
        int yfinal = m - 1;
        int indice = 0;
        while(xstart <= xfinal && ystart <= yfinal){
            for(int i = xstart ; i <= xfinal ; i++){
                output[indice] = matrix[i][ystart];
                indice++;
            }
            ystart++;

            for(int j = ystart ; j <= yfinal ; j++){
                output[indice] = matrix[xfinal][j];
                indice++;
            }
            xfinal--;

            if(xstart <= xfinal){
                for(int i = xfinal ; i >= xstart ; i--){
                    output[indice] = matrix[i][yfinal];
                    indice++;
                }
                yfinal--;
            }

            if(ystart <= yfinal){
                for(int j = yfinal ; j >= ystart ; j--){
                    output[indice] = matrix[xstart][j];
                    indice++;
                }
                xstart++;
            }
        }
        return output;
    }
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("n = ");
        int n = scan.nextInt();
        System.out.print("m = ");
        int m = scan.nextInt();
        int[][] matrix = new int[n][m];
        for(int j = 0 ; j < m ; j++){
            for(int i = 0 ; i < n ; i++){
                System.out.print("["+i+","+j+"] = ");
                matrix[i][j] = scan.nextInt();
            }
        }
        int[] output = spiral(matrix);
        System.out.print("[ ");
        for(int i = 0 ; i < output.length ; i++){
            System.out.print(output[i] + " ");
        }
        System.out.print("]");
        scan.close();
    }
}

