import java.util.Scanner;

public class starPatternThree {
    public static void main(String[] args) {
        int row;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Rows : ");
        row = sc.nextInt();
        sc.close();
        System.out.println("\nRows : "+row);

        for (int i = 1; i <= row; i++) {
            for (int j = row; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* "); // remove space another pattern will print
            }
            System.out.println();
        }
    }
}
