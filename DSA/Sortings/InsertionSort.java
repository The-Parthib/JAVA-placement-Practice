package DSA.Sortings;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = { 5, 3, 8, 12,1 };
        insertionSort(arr);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int j = i;
            while (j>0 && arr[j]<arr[j-1]) {
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
    }

}
