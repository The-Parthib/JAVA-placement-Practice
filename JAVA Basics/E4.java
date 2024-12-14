import java.util.Scanner;

public class E4 {
    public static void main(String[] args) {
        //@SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int a = sc.nextInt();
        System.out.print("Enter Second Number: ");
        int b = sc.nextInt();
        System.out.println("sum = "+(a+b));
        sc.close();
    }
}
