import java.util.Scanner;

public class armStrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        sc.close();
        boolean isArmstrong = isArmstrong(num);
        if (isArmstrong) {
            System.out.println("Your Number is Armstrong");
        }
        else{
            System.out.println("Your Number is not Armstrong");
        }
    }

    public static boolean isArmstrong(int n) {
        int original = n;
        int digitCount = digitCount(n);
        int result = 0;
        while (n>0) {
            int lastDigit = n%10;
            result += Math.pow(lastDigit, digitCount);
            n = n/10;
        }
        return result == original;
    }

    public static int digitCount(int n){
        int count = 0;
        while (n>0) {
            n = n/10;
            count++;
        }
        return count;
    }
}
