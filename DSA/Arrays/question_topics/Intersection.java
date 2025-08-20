package DSA.Arrays.question_topics;

import java.util.ArrayList;

public class Intersection {

    static ArrayList<Integer> intersectionOptimal(int[] arr1, int[] arr2){

        int m = arr1.length;
        int n = arr2.length;
        int i=0,j=0;

        ArrayList<Integer> list = new ArrayList<>();

        while (i<m && j<n) {
            if(arr1[i]<arr2[j]){
                i++;
            }
            else if(arr2[j]<arr1[i]){
                j++;
            }
            else{
                list.add(arr1[i]);
                i++;
            }
        }

        return list;
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 5, 6 };
        int[] arr2 = { 1, 3, 5, 8 };
        // [1,3,5]

        // unionBrute(arr1, arr2);
        ArrayList<Integer> result = intersectionOptimal(arr1, arr2);

        for (int i : result) {
            System.out.print(i + " ");
        }

    }
}
