import java.util.Stack;

public class invertirArreglo {
    public static int[] invertirStack(int[] arr){
        Stack<Integer> stack = new Stack<>();
        for(int i = 0 ; i < arr.length ; i++){
            stack.push(arr[i]);
        }
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = stack.pop();
        }
        return arr;
    }
    public static int[] invertirRecursivo(int[] arr, int start, int end){
        if(start <= end) return arr;
        int aux = arr[start];
        arr[start] = arr[end];
        arr[end] = aux;
        return invertirRecursivo(arr, start+1, end-1);
    }
    public static int[] invertirIterativo(int[] arr){
        int start = 0;
        int end = arr.length-1;
        int aux = 0;
        while(start > end){
            aux = arr[start];
            arr[start] = arr[end];
            arr[end] = aux;
            start++;
            end--;
        }
        return arr;
    }
    public static void print(int[] arr){
        for(int i = 0 ; i < arr.length ; i++){
            System.out.printf("%d ", arr[i]);
        }
        System.out.println();
    }
    public static void main(String[] args){
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        print(arr);
        print(invertirStack(arr));
        print(invertirRecursivo(arr, 0, arr.length-1));
        print(invertirIterativo(arr));
    }
}
