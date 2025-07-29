package DSA.Arrays.basics;

public class Smallest {
    public static void main(String[] args) {
        int[] arr = {3,5,6,4,8,1,9};

        int small = arr[0];
        int sSmall = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (small>arr[i]) {
                sSmall = small;
                small = arr[i];
            }
            else if(arr[i] != sSmall && arr[i]<small){
                sSmall = arr[i];
            }
        }
        System.out.println(small);
        System.out.println(sSmall);
    }
}
