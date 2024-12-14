import java.util.Scanner;

public class E3 {
    public static void main(String[] args) {
        // @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Name:");
        String g = sc.nextLine();
        System.out.println("Good Night "+ g);
        sc.close();
    }
}
