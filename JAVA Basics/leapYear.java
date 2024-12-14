import java.util.Scanner;

public class leapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Year : ");
        int year = sc.nextInt();

        if (year%4 == 0 && year%100 != 0) {
            System.out.println(year+ " is Leap Year");
        }
        else if(year%100 == 0 && year%400 == 0){
            System.out.println(year + " is Leap year");
        }
        else{
            System.out.println("Nikal laudee, Leap year kya hota h nhi pata..??");
        }

        // int a = -11;
        // int c = (a | b);
        // System.out.println(-a);

        sc.close();
    }
}
