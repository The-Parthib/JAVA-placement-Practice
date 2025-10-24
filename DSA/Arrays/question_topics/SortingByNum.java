package DSA.Arrays.question_topics;

// given array of elements 0s 1s and 2s >>> sort them like 0..1..2..

public class SortingByNum {

    static void bruteForce(int[] arr) {
        int n = arr.length;
        int zero = 0, one = 0, two = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                zero++;
            } else if (arr[i] == 1) {
                one++;
            } else {
                two++;
            }
        }

        // Remove unused variable
        // int m = zero + one + two;

        for (int j = 0; j < zero; j++) {
            arr[j] = 0;
        }
        for (int j = zero; j < zero + one; j++) { // Fixed: start from zero, end at zero + one
            arr[j] = 1;
        }
        for (int j = zero + one; j < zero + one + two; j++) { // Fixed: start from zero + one
            arr[j] = 2;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 0, 1, 2, 0, 0, 1, 2, 1, 1, 2, 0, 0, 2, 1, 1 };
        bruteForce(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
