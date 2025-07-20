package DSA.Sortings;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {2,6,1,4,9,12,10,3};

        for (int i = 0; i < arr.length-1; i++) {
            int min = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j]<arr[min]) {
                    int temp = arr[min];
                    arr[min] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
