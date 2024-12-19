import java.util.Scanner;

public class palinDrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num = sc.nextInt();
        boolean isPalindrome = isPalindrome(num);
        if (isPalindrome) {
            System.out.println(num + " is Palindrome Number");
        }
        else{
            System.out.println(num + " is Not Palindrome Number");
        }
        sc.close();
    }

    public static boolean isPalindrome(int n){
        int original = n;
        int temp = 0, digit;
        while (n>0) {
            digit = n%10;
            temp = temp*10 + digit;
            n = n/10;
        }
        return original == temp;
    }
}
