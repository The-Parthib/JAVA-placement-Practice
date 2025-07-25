package DSA.Sortings;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = { 1,2,3,4,5,6,7,8 };
        // int[] arr = { 5, 3, 8, 12, 7, 1, 9, 40, 33 };
        bubbleSort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }

    }

    public static void bubbleSort(int[] arr) {
        int didSwap = 0;
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    didSwap = 1;
                }
            }
            // optimization
            if (didSwap == 0) {
                break;
            }
            // System.out.println(didSwap);
        }
    }
}
