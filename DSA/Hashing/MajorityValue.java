package DSA.Hashing;

import java.util.HashMap;
// import java.util.Map;

// find all elements that are appear more than [n/3] times in the array
// {1,3,2,5,1,3,1,5,1} 
// key = unique not repetative elements || value = frequency of elements

public class MajorityValue {
    public static void main(String[] args) {
        // int[] arr = {1,3,2,5,1,3,1,5,1}; // size = 9
        int[] arr = {1,3,2,5,1,3,1,5,1,5,5,5};
        // int[] arr = {1,3};
        int n= arr.length;
        HashMap <Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i])+1);
            }
            else{
                map.put(arr[i], 1);
            }
        }

        // for (Map.Entry<Integer,Integer> e : map.entrySet()) {
        //     System.out.println(e.getKey()+" -> "+e.getValue());
        //     if (e.getValue()>(n/3)) { // n size is 12
        //         System.out.println(e.getKey()+" is the major elemet");
        //     }
        // }


        // alternative to print
        for (int key : map.keySet()) {
            if (map.get(key)>n/3) {
                System.out.println(key);
            }
        }


        
    }
}
