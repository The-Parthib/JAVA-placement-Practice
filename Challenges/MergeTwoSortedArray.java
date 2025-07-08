public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int[] arr1 = ArrayUtility.arrayInput();
        int[] arr2 = ArrayUtility.arrayInput();
        if ((SortedCheck.isIncreasing(arr1) && SortedCheck.isIncreasing(arr2))||(SortedCheck.isDecreasing(arr1) && SortedCheck.isDecreasing(arr2))) {
            int[] arr = merge(arr1, arr2);
            System.out.println("The new sorted array is : ");
            for (int i : arr) {
                System.out.print(i+" ");
            }
        }
        else{
            System.out.println("Not sorted");
        }
    }

    public static int[] merge(int[] arr1,int[] arr2){
        int size = arr1.length + arr2.length;
        System.out.println(size);
        int[] newArr = new int[size];
        int i=0,j=0,k=0;
        while (i<arr1.length || j<arr2.length) {
            if (j==arr2.length ||
                    (i<arr1.length && arr1[i]<arr2[j])) {
                newArr[k] = arr1[i];
                k++;
                i++;
            }
            else{
                newArr[k] = arr2[j];
                k++;
                j++;
            }
        }
        return newArr;
    }
}
