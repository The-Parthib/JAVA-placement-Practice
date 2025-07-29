package DSA.Arrays.basics;

public class LargestElement {

    // brute force is to sort the array and pick the last element

    // static void sort(int[] arr){
    //     for (int i = 0; i < arr.length; i++) {
    //         for (int j = i; j < arr.length; j++) {
    //             if(arr[j]<arr[i]){
    //                 int temp = arr[j];
    //                 arr[j] = arr[i];
    //                 arr[i] = temp;
    //             }
    //         }
    //     }
    // }

    // optimal
    public static void main(String[] args) {
        int[] arr = { 4, 5, 2, 8, 7, 1 };

        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(max<arr[i]){
                max = arr[i];
            }
        }

        System.out.println(max);
    }

}
