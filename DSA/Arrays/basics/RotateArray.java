package DSA.Arrays.basics;
/*
 * [1,2,3,4,5,6,7]
 * rotate by k = 3 elements here
 * [5,6,7,1,2,3,4] this is resultant array
 * 
 */


public class RotateArray {
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k=k%n;

        // extract to temp array
        int[] temp = new int[k];

        for(int i=0;i<k;i++){
            temp[i] = nums[n-k+i];
        }

        // shifting
        for(int i=n-k-1;i>=0;i--){
            nums[i+k] = nums[i];
        }

        // re-build
        for(int i=0;i<k;i++){
            nums[i] = temp[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};

        System.out.println("original array : ");
        for (int i : arr) {
            System.out.print(i+" ");
        }
        
        System.out.println("\nrotated  array : ");
        rotate(arr,3);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
    
}
