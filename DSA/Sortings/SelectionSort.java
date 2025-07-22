package DSA.Sortings;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {2,6,1,4,9,12,10,3};

        for(int i = 0; i<arr.length-1;i++){
            for(int j = i;j<arr.length;j++){
                if (arr[j]<arr[i]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        for(int e : arr){
            System.out.print(e+" ");
        }
    }
}
