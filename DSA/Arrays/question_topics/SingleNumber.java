package DSA.Arrays.question_topics;

/*
 * This problem states that every elements in the array occures twice
 * [2,2,3,4,4,5,5]  here 3 occurs only once and I have to return that only.
 */

public class SingleNumber {

    static int BruteSingleNumber(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if(arr[j]==num){
                    count++;
                }
            }
            if(count==1){
                return arr[i];
            }
        }
        return -1;
    }

    static int OptimalSinglenumber(int[] arr){
        int xor=0;
        for (int i : arr) {
            xor = xor^i;
        }
        return xor;
    }


    public static void main(String[] args) {
        int[] arr = { 1,1,2,3,2,4,4 };
        // BruteSingleNumber(arr);
        int x = OptimalSinglenumber(arr);
        System.out.println(x);
        
    }
    
}
