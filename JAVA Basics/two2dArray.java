import java.util.Scanner;

public class two2dArray {
    public static void main(String[] args) {
        int [][] numArr = new int[4][3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to 2D Array : \n");
        for (int i = 0; i < 4; i++) {
            System.out.println("Enter Elemet for "+i+" Row:");
            for (int j = 0; j < 3; j++) {
                System.out.print("numArr["+i+"]["+j+"] : ");
                numArr[i][j] = sc.nextInt();
            }
        }
        System.out.println("\nHere is Your 2D Array Elements : \n");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(numArr[i][j]+" ");
            }
            System.out.println("");
        }
        sc.close();
    }
}
