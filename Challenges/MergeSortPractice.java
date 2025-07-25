import java.util.ArrayList;

public class MergeSortPractice {
    public static void main(String[] args) {
        int[] arr = {2,5,1,9,7,4};

        mergeSort(arr, 0, arr.length-1);

        for (int i : arr) {
            System.out.print(i+" ");
        }

    }

    static void mergeSort(int[] arr,int low, int high){

        if(low == high) return;

        int mid = (low+high)/2;

        mergeSort(arr, low, mid);
        mergeSort(arr, mid+1, high);

        merger(arr, low, mid, high);

    }

    static void merger(int[] arr,int low, int mid, int high){
        ArrayList<Integer> temp = new ArrayList<>();

        int left = low;
        int right = mid+1;

        while (left<=mid && right<=high) {
            if (arr[left]<arr[right]) {
                temp.add(arr[left]);
                left++;
            }
            else{
                temp.add(arr[right]);
                right++;
            }
        }
        while (left<=mid) {
            temp.add(arr[left]);
            left++;
        }
        while (right<=high) {
            temp.add(arr[right]);
            right++;
        }

        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i-low);
        }
    }
}
