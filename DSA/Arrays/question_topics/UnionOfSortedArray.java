package DSA.Arrays.question_topics;

import java.util.ArrayList;
import java.util.HashSet;

// nums1[] = [1,2,3,4,5,6];
// nums2[] = [1,3,6];
// union of these two arrays.
public class UnionOfSortedArray {

    static void unionBrute(int[] arr1, int[] arr2) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }

        for (int i = 0; i < arr2.length; i++) {
            set.add(arr2[i]);
        }

        // Method 1: Using enhanced for loop (preferred)
        System.out.print("Union of arrays: ");
        for (int num : set) {
            System.out.print(num + " ");
        }
    }

    static ArrayList<Integer> unionOptimal(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        int i = 0;
        int j = 0;

        ArrayList<Integer> temp = new ArrayList<>();

        while (i < n1 && j < n2) {
            if (arr1[i] < arr2[j]) {
                if (temp.size() == 0 || !temp.contains(arr1[i])) {
                    temp.add(arr1[i]);
                }
                i++;
            } else {
                if (temp.size() == 0 || !temp.contains(arr2[j])) {
                    temp.add(arr2[j]);
                }
                j++;
            }
        }

        while (j < n2) {
            if (temp.size() == 0 || !temp.contains(arr2[j])) {
                temp.add(arr2[j]);
            }
            j++;
        }

        while (i < n1) {
            if (temp.size() == 0 || !temp.contains(arr1[i])) {
                temp.add(arr1[i]);
            }
            i++;
        }

        return temp;
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 5, 6 };
        int[] arr2 = { 1, 3, 5 ,8};

        // unionBrute(arr1, arr2);
        ArrayList<Integer> result =unionOptimal(arr1, arr2);

        for (int i : result) {
            System.out.print(i+" ");
        }

    }
}
