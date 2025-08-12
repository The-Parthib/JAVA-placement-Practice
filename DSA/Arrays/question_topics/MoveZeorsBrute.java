package DSA.Arrays.question_topics;

import java.util.ArrayList;

public class MoveZeorsBrute {

    static void moveZeros(int[] arr) {
        // store to temp non zero elements.
        int n = arr.length;
        ArrayList<Integer> temp = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                temp.add(arr[i]);
            }
        }
        System.out.println(temp.get(2));

        // store back to original array;

        for (int i = 0; i < temp.size(); i++) {
            arr[i] = temp.get(i);
        }

        // zeros

        for (int i = temp.size(); i < arr.length; i++) {
            arr[i] = 0;
        }
    }

    static void moveZerosOptimal(int[] arr) {
        int n = arr.length;

        int j = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                j = i;
                break;
            }
        }

        if (j == -1) {
            return;
        }

        for (int i = j + 1; i < n; i++) {
            if (arr[i] != 0) {
                // swapping
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;

                j++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 0, 2, 3, 2, 0, 0, 4, 5, 1 };

        moveZerosOptimal(arr);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
