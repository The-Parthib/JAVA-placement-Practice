import java.util.Scanner;

public class ArrayUtility {
    public static void main(String[] args) {
        System.out.println("Array utility");
        int [] sArray = arrayInput();
        for (int i : sArray) {
            System.out.print(i+" ");
        }
    }

    public static int[] arrayInput(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Array : ");
        int size = sc.nextInt();
        int[] myArr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("enter "+(i+1)+" element : ");
            myArr[i] = sc.nextInt();
        }

        return myArr;
    }

    public static void display(int[] arr){
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
