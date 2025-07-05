public class minMaxArray {
    public static void main(String[] args) {
        int[] myArray = ArrayUtility.arrayInput();
        for (int i : myArray) {
            System.out.print(i+" ");
        }
        int max = maxElement(myArray);
        int min = minElement(myArray);

        System.out.println("\nMax element of the array : "+max);
        System.out.println("\nMin element of the array : "+min);
    }

    public static int minElement(int[] arr){
        int min = Integer.MAX_VALUE;
        int i = 0;
        while (i<arr.length) {
            if (min>arr[i]) {
                min = arr[i];
            }
            i++;
        }
        
        return min;
    }
    public static int maxElement(int[] arr){
        if(arr.length == 0){
            return Integer.MIN_VALUE;
        }
        int max = arr[0];
        int i=1;
        while (i<arr.length) {
            if(max<arr[i]){
                max = arr[i];
            }
            i++;
        }
        return max;
    }
}
