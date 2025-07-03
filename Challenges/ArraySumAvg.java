import java.util.Scanner;

public class ArraySumAvg {

    public static int sumArr(int[] arr){
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum +=arr[i];
        }
        return sum;
    }

    public static int sumAvg(int[] arr){
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum +=arr[i];
        }
        return sum/arr.length;
    }

    public static void main(String[] args) {
        System.out.println("Enter the number of elements : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] myArray = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("enter the number : ");
            myArray[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            System.out.print(myArray[i]+" ");
        }

        System.out.println("Sum of elements : "+sumArr(myArray));
        System.out.println("Avg of elements : "+sumAvg(myArray));

        sc.close();
    }
}
