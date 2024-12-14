import java.util.Scanner;
public class E6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // ++++++++++++++++++++++ CAlCULATOR ++++++++++++++++++++
        // System.out.print("Enter First Number:");
        // int x = sc.nextInt();
        // System.out.print("Enter Second Number:");
        // int y = sc.nextInt();
        
        // System.out.println("X + Y = "+(x+y));
        // System.out.println("X - Y = "+(x-y));
        // System.out.println("X * Y = "+(x*y));
        // System.out.println("X / Y = "+(x/y));

        // ++++++++++++++++++++ FLOAT MUL ++++++++++++++++++++++++++

        // float a = 8.3f;
        // float b = 2f;

        // float result = a*b;
        // System.out.println("result = "+result);

        // ++++++++++++++++++++ Area of a Triangle +++++++++++++++++
        System.out.print("Enter the Base : ");
        int a = sc.nextInt();
        System.out.print("Enter the height : ");
        int b = sc.nextInt();

        double result = 0.5*a*b;
        System.out.println("area of the Triangle is : "+result);

        sc.close();
    }
}
