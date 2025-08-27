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

    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 5 };
        System.out.println("The misiing element is : " + findMissingelementBetter(arr));
    }
}
