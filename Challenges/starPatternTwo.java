import java.util.Scanner;

public class starPatternTwo {
    public static void main(String[] args) {
        int row;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Rows : ");
        row = sc.nextInt();
        sc.close();
        System.out.println("\nRows : "+row);

        for (int i = 0; i < row; i++) {
            for (int j = row-i; j > 0 ; j--) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}
