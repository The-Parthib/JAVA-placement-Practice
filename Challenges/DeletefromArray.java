import java.util.Scanner;

public class DeletefromArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] myArr = ArrayUtility.arrayInput();
        System.out.print("Enter the number you want to delete : ");
        int element = sc.nextInt();
        System.out.print("Previous array : ");
        ArrayUtility.display(myArr);

        int[] newArr = delete(myArr, element);
        System.out.println("\nAfter deleting "+element+" array : ");
        ArrayUtility.display(newArr);
        sc.close();
    }

    public static int[] delete(int[] arr,int element){
        int occ = OccurencesArray.occTimes(arr, element);
        if (occ == 0) {
            return arr;
        }

        int newSize = arr.length-occ;
        int[] newArr = new int[newSize];
        int j=0;
        for (int k : arr) {
            if (k != element) {
                newArr[j] = k;
                j++;
            }
            else{
                System.out.println(element+" is not present in the Array");
            }
        }
        return newArr;
    }
}
