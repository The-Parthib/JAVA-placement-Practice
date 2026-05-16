package Academy_of_pakhi;

import java.util.*;

public class Repetation {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 1};

        int rs = repeat(arr);
        System.out.println(rs);

        
    }

    private static int repeat(int[] arr){
        HashSet<Integer> set = new HashSet<>();

        for (int a : arr) {
            if(set.contains(a)){
                return a;
            }
            set.add(a);
        }

        return -1;
    }
}
