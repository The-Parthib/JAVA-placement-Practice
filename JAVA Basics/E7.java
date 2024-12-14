import java.util.Scanner;

public class E7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ticket Booking");
        System.out.print("Enter Your Age: ");
        int age = sc.nextInt();
        System.out.print("Are You Female..??");
        boolean gen = sc.nextBoolean();

        if(age<5){
            System.out.println("75% Ticket Price less");
        }

        else if(gen){
            System.out.println("50% ticket price less");
        }
        sc.close();
    }
}
