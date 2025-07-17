package DSA.Hashing;
// you are given an array and determine the subArray sum that is equal to k.
// formula :  sum(j) - k = sum(i-1);

import java.util.HashMap;

public class SubArray {
    public static void main(String[] args) {
        int[] arr = {10,2,-2,-20,10};
        int k=-10,ans=0,sum=0;
        HashMap<Integer,Integer> map = new HashMap<>(); // <sum,freq>
        map.put(0, 1); // empty sub array

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (map.containsKey(sum-k)) {
                ans += map.get(sum-k);
            }
            if (map.containsKey(sum)) {
                map.put(sum, map.get(sum)+1);
            }
            else{
                map.put(sum, 1);
            }
        }
        System.out.println(ans);

    }
}
