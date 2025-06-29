import java.util.Scanner;

public class Patterns {
    public static void main(String[] args) {
        // PatternOne();
        // PatternTwo();
        PatternThree();
    }

    public static void PatternOne(){
        System.out.print("Enter the no of rows : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }

    public static void PatternTwo(){
        System.out.print("Enter the no of rows : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }

    public static void PatternThree(){
        System.out.print("Enter the no of rows : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=n-i; j++) {
                System.out.print("  ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
