public class MoveAllZeros {

    static void rotate(int[] arr){
        int n = arr.length;
        int j=-1;

        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                j=i;
                break;
            }
        }

        if(j==-1) return;

        for (int i = j+1; i < n; i++) {
            if (arr[i] != 0) {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;

                j++;
            }
        }

    }

    public static void main(String[] args) {
        int[] arr = {1,2,0,3,0,4,7,0};

        rotate(arr);

        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
