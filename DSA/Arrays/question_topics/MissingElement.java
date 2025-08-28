package DSA.Arrays.question_topics;

public class MissingElement {

    static int findMissingElementBrute(int[] arr) {
        int n = arr.length;

        for (int i = 1; i <= n; i++) {
            int flag = 0;
            for (int j = 0; j < n; j++) {
                if (arr[j] == i) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                return i;
            }
        }
        return -1;
    }

    static int findMissingelementBetter(int[] arr){
        int n = arr.length;
        int[] hash = new int[n+1];

        for (int i = 0; i < n-1; i++) {
            hash[arr[i]] = 1;
        }
        for (int i = 1; i < n; i++) {
            if (hash[i] == 0) {
                return i;
            }
        }
        return -1;
    }

    static int findMissingelementOptimal(int[] arr){
        // as the array is not containing 0 so take the length +1;

        int n = arr.length+1;
        int sum = (n*(n+1))/2;
        int result = 0;
        for (int i = 0; i < n-1; i++) {
            result = result+arr[i];
        }
        result = sum-result;
        return result;
    }

    static int findMissingelementXor(int[] arr){
        int xor1 = 0;
        // for (int i = 1; i <= arr.length+1; i++) {
        //     xor1 = xor1^i;
        //     System.out.println(xor1);
        // }
        int xor2 = 0;
        for (int i = 0; i < arr.length; i++) {
            xor2=xor2^arr[i];
            xor1 = xor1^(i+1);
        }
        xor1=xor1^arr.length+1; // for last element  
        return xor2^xor1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 5 };
        // System.out.println("The misiing element is : " + findMissingelementBetter(arr));
        // System.out.println("The misiing element is : " + findMissingelementOptimal(arr));
        System.out.println("The misiing element is : " + findMissingelementXor(arr));
    }
}
