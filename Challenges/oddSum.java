import java.util.Scanner;

public class oddSum {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limit : ");
        int lim = sc.nextInt();

        for (int i = 1; i <= lim; i++) {
            if (i%2 != 0) {
                sum = sum+i;
            }
            else{
                System.out.println(i+" is even.");
            }
        }
        System.out.println("Sum of all odd numbers : "+sum);
        sc.close();
    }
}
