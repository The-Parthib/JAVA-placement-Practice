import java.util.Scanner;

public class Patterns {
    public static void main(String[] args) {
        // PatternOne();
        // PatternTwo();
        // PatternThree();
        // patternFour(5);
        // patternFive(5);
        // patternSIX(4);
        patternSeven(5);
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

    public static void patternFour(int row){
        for (int i = 1; i <=row; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void patternFive(int row){
        for (int i = 1; i <=row; i++) {
            for (int j = 1; j <= row-i+1; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void patternSIX(int row){
        for (int i = 0; i <row; i++) {
            // SPACE
            for (int j = 0; j < row-i-1; j++) {
                System.out.print(" ");
            }
            // STAR
            for (int j = 0; j < 2*i+1; j++) {
                System.out.print("*");
            }

            // SPACE
            for (int j = 0; j < row-i-1; j++) {
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }

    public static void patternSeven(int row){
        for (int i = 0; i < row; i++) {
            for (char ch = 'A'; ch < 'A'+i; ch++) {
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
}
