package DSA.Arrays.question_topics;

import java.util.ArrayList;

public class Intersection {

    static ArrayList<Integer> intersectionOptimal(int[] arr1, int[] arr2){

        ArrayList<Integer> list = new ArrayList<>();


        return list;
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 5, 6 };
        int[] arr2 = { 1, 3, 5, 8 };
        // [1,3,5]

        ArrayList<Integer> result = intersectionOptimal(arr1, arr2);

        for (int i : result) {
            System.out.print(i + " ");
        }

    }
}
