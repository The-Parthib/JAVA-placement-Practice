public class SortedCheck {
    public static void main(String[] args) {
        int[] myArray = ArrayUtility.arrayInput();

        if (isDecreasing(myArray) || isIncreasing(myArray)) {
            System.out.println("Array id sorted");
        }
        else{
            System.out.println("Array is not sorted");
        }
    }

    public static boolean isIncreasing(int[] arr){
        int i = 1;
        while (i<arr.length) {
            if (arr[i]<arr[i-1]) {
                return false;
            }
            i++;
        }
        return true;
    }

    public static boolean isDecreasing(int[] arr){
        int i = 1;
        while (i<arr.length) {
            if (arr[i]>arr[i-1]) {
                return false;
            }
            i++;
        }
        return true;
    }
}
