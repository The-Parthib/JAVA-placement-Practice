public class OccurencesArray {
    public static void main(String[] args) {
        int[] nArray = {2,4,5,3,2,6,7,1,9,2,12,2,11,30};
        ArrayUtility.display(nArray);
        int count = occTimes(nArray, 2);
        System.out.println("\n2 is present in the array "+count+" times");
    }

    public static int occTimes(int[] arr, int check){
        int count = 0;
        // for each loop
        for(int num : arr){
            // System.out.print(num+" ");
            if (num == check) {
                count++;
            }
        }
        return count;
    }
}