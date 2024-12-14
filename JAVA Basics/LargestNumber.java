import java.util.Scanner;

public class LargestNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number (x): ");
        int x = scanner.nextInt();

        System.out.print("Enter the second number (y): ");
        int y = scanner.nextInt();

        System.out.print("Enter the third number (z): ");
        int z = scanner.nextInt();

        int largest;
        if (x >= y && x >= z) {
            largest = x;
        } else if (y >= x && y >= z) {
            largest = y;
        } else {
            largest = z;
        }

        System.out.println("The largest number is: " + largest);
        scanner.close();
    }
}
