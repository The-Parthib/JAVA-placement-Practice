package DSA.Arrays;

// reset the sum if the sum is less than 0;

public class KadanceAlgo {
    public static void main(String[] args) {
        // int[] arr = {1,2,3,4,5};
        int[] arr = {3,-4,5,4,-1,7,-8};
        int sum = Integer.MIN_VALUE;
        int currSum=0;
        for (int i = 0; i < arr.length; i++) {
            currSum+=arr[i];
            sum = Math.max(currSum, sum);
            if (currSum <0) {
                currSum = 0;
            }
        }
        System.out.println(sum);

        // int rs = alterNative(arr);
        // System.out.println(rs);
    }

    // AlterNative of kadance algorithm but take time O{n^2}

    public static int alterNative(int[] arr){
        int sum = Integer.MIN_VALUE;
        int currSum = 0;
        for (int i = 0; i < arr.length; i++) {
            currSum = 0;
            for (int j = i; j < arr.length; j++) {
                currSum+=arr[j];
                sum = Math.max(sum, currSum);
            }
        }
        return sum;
    }
}
