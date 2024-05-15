public class Util {
    public static int[] generateRandomArray(int N) {
        int[] A = new int[N];
        for(int i = 0; i < N; i++) {
            A[i] = (int)(Math.random() * 100);
        }
        return A;
    }

    public static void printArray(int[] A) {
        for(int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();
    }
}