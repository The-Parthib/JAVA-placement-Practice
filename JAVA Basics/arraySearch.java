import java.util.Scanner;

public class arraySearch {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the limit : ");
    int n = sc.nextInt();
    int[] arr = new int[n];
    int temp;
    for (int i = 0; i < arr.length; i++) {
        temp = sc.nextInt();
        arr[i]=temp;
    }
    System.out.print("Array Elements : ");
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i]+" ");
    }

    System.out.print("\nEnter the element You searchig for : ");
    temp = sc.nextInt();

    for (int i = 0; i < arr.length; i++) {
        if (arr[i]==temp) {
            System.out.println(temp+"  at location : "+(i+1));
            break;
        }
    }
    sc.close();
}
}