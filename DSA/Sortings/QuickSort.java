package DSA.Sortings;

public class QuickSort {

    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = findPivot(arr, low, high);

            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    static int findPivot(int[] arr, int low, int high) {

        int i = low;
        int j = high;
        int pivot = arr[low];

        while (i < j) {
            while (i<=high && arr[i] <= pivot) {
                i++;
            }
            while (j>=low && arr[j] > pivot) {
                j--;
            }
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;

        return j;
    }

    public static void main(String[] args) {
        int[] arr = { 4, 6, 2, 5, 7, 9, 1, 3 };

        quickSort(arr, 0, arr.length - 1);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

}
