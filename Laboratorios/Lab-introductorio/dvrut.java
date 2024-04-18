import java.util.Scanner;

public class dvrut {
    public static int[] reverse(int[] input){
        int start = 0;
        int last = input.length-1;
        while(start < last){
            int temp = input[start];
            input[start] = input[last];
            input[last] = temp;
            start++;
            last--;
        }
        return input;
    }
    public static int[] dv(int[] input){
        int[] rut = new int[9];
        for(int i = 0 ; i < input.length ; i++){
            rut[i] = input[i];
        }
        input = reverse(input); //paso 1
        int paso2 = 0;  //paso 2
        int[] serie = {2, 3, 4, 5, 6, 7};
        int serieindice = 0;
        for(int i = 0 ; i < input.length ; i++){
            paso2 += (input[i] * serie[serieindice]);
            if(serie[serieindice] == 7){
                serieindice = 0;
            }else{
                serieindice++;
            }
        }
        int paso3 = paso2 / 11; //paso 3
        paso3 = paso3*11;
        int paso4 = paso2 - paso3;  // paso 4
        int paso5 = 11 - paso4; //paso 5
        rut[8] = paso5;
        return rut;
    }
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int[] input = new int[8];
        for(int i = 0 ; i < 8 ; i++){
            input[i] = scan.nextInt();
        }
        int[] rut = dv(input);
        for(int i = 0 ; i < rut.length - 1 ; i++){
            System.out.print(rut[i]);
            if(i == 1 || i == 4){
                System.out.print(".");
            }
        }
        if(rut[8] == 11){
            System.out.println("-0");
        }else if(rut[8] == 10){
            System.out.println("-k");
        }else{
            System.out.println("-"+rut[8]);
        }
        scan.close();
    }
}
