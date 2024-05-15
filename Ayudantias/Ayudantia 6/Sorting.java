public class Sorting {
    public static void bubbleSort(int []A, int N) {
        int temp;
        for(int i = 0; i < N - 1; i++) {
            System.out.println("1# For i: " + i);
            for(int j = 0; j < N - i - 1; j++){
                System.out.println("2# For j: " + j);
                System.out.println("Es Mayor? " + A[j] + ">" + A[j+1]);
                if(A[j] > A[j+1]) {
                    System.out.println("SI LO ES");
                    temp = A[j];
                    A[j] = A[j+1];
                    A[j+1] = temp;
                }
                for(int u = 0; u < N-1 ; u++){
                    System.out.println("Ahora el arreglo es: " + "#"+ u + " "+ A[u]);
                }

            }
        }
    }

    public static void selectionSort(int []A, int N) {
        int temp;
        for(int i = 0; i < N - 1; i++) {
            int min = i;
            System.out.println("1# For i: " + i);
            System.out.println("1# min: " + i);
            for(int j = i + 1; j < N; j++) {
                System.out.println("2# For j: " + j);
                System.out.println("Es Mayor? " + A[j] + "<" + A[min]);
                if(A[j] < A[min]) {
                    System.out.println("SI LO ES");
                    min = j;
                    System.out.println("resutado min if: " + min);
                }
            }
            temp = A[min];
            A[min] = A[i];
            A[i] = temp;

            System.out.println("temp: " + temp);
            System.out.println("A[min]: " + A[min]);
            System.out.println("A[i]: " + min);

            for(int u = 0; u < 10 ; u++){
                System.out.println("Arreglo es: " + "#"+ u + " "+ A[u]);
            }
        }
    }

    public static void insertionSort(int []A, int N) {
        int key;
        for(int i = 1; i < N; i++) {
            System.out.println("for i: " + i);
            key = A[i];
            System.out.println("key: " + key + " #" + i);
            int j = i - 1;
            System.out.println("for j: " + j);

            System.out.println("entra en el while si: " + j + ">=0 && " + A[j] + ">" + key );
            while(j >= 0 && A[j] > key) {
                System.out.println("SI ENTRO");
                System.out.println("WHILE entra en el while si: " + j + ">=0 && " + A[j] + ">" + key );
                System.out.println("WHILE nuevo valor de A[j+1]: " + A[j+1] + " cambia por " + A[j]);
                A[j+1] = A[j];
                j--;
            }

            A[j+1] = key;
            System.out.println("nuevo valor de A[j+1]: " + A[j+1] + " cambia por " + key);

            for(int u = 0; u < 10 ; u++){
                System.out.println("Arreglo es: " + "#"+ u + " "+ A[u]);
            }
        }
    }

    static void merge(int array[], int p, int q, int r) {

        int n1 = q - p + 1; // mid - lo + 1
        int n2 = r - q; // hi - mid

        int L[] = new int[n1];
        int M[] = new int[n2];

        for (int i = 0; i < n1; i++)
            L[i] = array[p + i];
        for (int j = 0; j < n2; j++)
            M[j] = array[q + 1 + j];

        int i, j, k;
        i = 0;
        j = 0;
        k = p;

        while (i < n1 && j < n2) {
            if (L[i] <= M[j]) {
                array[k] = L[i];
                i++;
            } else {
                array[k] = M[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            array[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            array[k] = M[j];
            j++;
            k++;
        }
    }

    static void mergeSort(int[] arr, int lo, int hi) { // O(N)= lg(N)
        if(lo >= hi) { //1
            //System.out.println(arr[(lo + hi) / 2]);
            return; // 1
        }
        int q = (lo + hi)/2;
        mergeSort(arr, lo, q);
        mergeSort(arr, q + 1, hi);
        merge(arr, lo, (lo + hi) / 2, hi); // N
    }

    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    static void heapSort(int []A, int N) {

    }

    static void countingSort(int []A, int N) {

    }
}