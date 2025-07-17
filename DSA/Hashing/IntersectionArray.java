package DSA.Hashing;

import java.util.HashSet;

public class IntersectionArray {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,2};
        int[] arr2 = {6,3,2,1,4,7,2,2,2};

        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> result = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }

        System.out.println(set);
        for (int i = 0; i < arr2.length; i++) {
            if (set.contains(arr2[i])) {
                result.add(arr2[i]);
            }
        }

        System.out.println(result);
        
    }
}
