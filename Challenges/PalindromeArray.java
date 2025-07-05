public class PalindromeArray {
    public static void main(String[] args) {
        int[] arr = ArrayUtility.arrayInput();
        boolean isPalin = isPalindromeCheck(arr);
        if (isPalin) {
            System.out.println("Array is Palindrome");
        }
        else{
            System.out.println("Array is not Palindrome");
        }
    }

    public static boolean isPalindromeCheck(int[] arr){
        int i=0;
        while (i<arr.length) {
            if(arr[i] != arr[arr.length-1-i]){
                return false;
            }
            i++;
        }
        return true;
    }
}
