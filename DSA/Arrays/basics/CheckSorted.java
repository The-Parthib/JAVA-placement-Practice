package DSA.Arrays.basics;

public class CheckSorted {
    public static void main(String[] args) {
        int[] arr = {1,2,2,2,2,3,4,5,6,7};

        boolean res = isSorted(arr);
        System.out.println(res);

    }

    static boolean isSorted(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i]>arr[i+1]) {
                return false;
            }
        }
        return true;
    }
}
