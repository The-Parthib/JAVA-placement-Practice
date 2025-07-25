package DSA.Sortings;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = { 2, 6, 1, 4, 9, 12, 10, 3 };

        selectionSort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }

    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }
}
