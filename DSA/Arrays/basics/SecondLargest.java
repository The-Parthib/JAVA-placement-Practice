package DSA.Arrays.basics;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = { 4, 5, 2, 8, 7, 1, 9, 10,10,10,10,12 };

        int largest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        int sLargest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > sLargest && arr[i] != largest) {
                sLargest = arr[i];
            }
        }

        int rs = secondLargest(arr);

        System.out.println(largest);
        System.out.println(sLargest);
        System.out.println(rs);
    }

    static int secondLargest(int[] arr){
        int large = arr[0];
        int sLargest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>large) {
                sLargest = large;
                large = arr[i];
            }
            else if(arr[i]<large && arr[i]>sLargest){
                sLargest = arr[i];
            }
        }

        return sLargest;
    }
}
