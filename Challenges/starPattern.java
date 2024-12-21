import java.util.Scanner;

public class starPattern {
    public static void main(String[] args) {
        int row;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of ROWS : ");
        row = sc.nextInt();
        System.out.println("\nRowS : " + row);
        sc.close();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}
