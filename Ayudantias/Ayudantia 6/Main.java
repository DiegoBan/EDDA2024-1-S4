public class Main {

    static boolean binarySearch(int[] arr, int target){
        int low = 0, high= arr.length-1;
        while (low <= high) {
            int mid = (low + high)/2;
            if(arr[mid] == target){
                return true;
            }else if(arr[mid] > target){
                high = mid-1;
            } else{
                low = mid + 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        //long startTime = System.nanoTime();

        int[] A = Util.generateRandomArray(10);
        for(int u = 0; u < 10 ; u++){
            System.out.println("Arreglo es: " + "#"+ u + " "+ A[u]);
        }
        int search = A[3];

        Sorting.bubbleSort(A, A.length);
        //Sorting.selectionSort(A, A.length);
        //Sorting.insertionSort(A, A.length);
        //Sorting.mergeSort(A, 0, A.length - 1);
        //Sorting.quickSort(A, 0, A.length - 1);

        for(int i = 0; i < 10 ; i++){
            System.out.println("Arreglo ordenado es: " + "#"+ i + " "+ A[i]);
        }

        binarySearch(A, search);
    }
}